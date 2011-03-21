// define a typed remoting API
class ClientApiImpl extends haxe.remoting.AsyncProxy<ClientApi> {
}

// our client class
class ClientData implements ServerApi {

	var api : ClientApiImpl;
	var name : String;	
	var myMark: Bool;
	var ifMyTurn : Bool;	
	var gameField :Array<Int>; 

	public function new( scnx : haxe.remoting.SocketConnection ) {
		api = new ClientApiImpl(scnx.client);
		(cast scnx).__private = this;
	}

	public function identify( name : String ) {
		if( this.name != null )
			throw "You are already identified";
		this.name = name;
		gameField = new Array<Int>();	
		
		for (i in 0...9)
			gameField[i] = 2;
		
		//true Mark = X, false Mark = O, others just watching
		if (Server.players.length == 0){
			Server.players.add(this);
			myMark = true;
			ifMyTurn = true;
			this.api.userAddMouseEvents();
		}
		else if (Server.players.length == 1) {
			Server.players.add(this);
			myMark = false;
			ifMyTurn = false;
			this.api.userAddMouseEvents();
		}
		else {
			Server.clients.add(this);
			
		}
		
		joinUsers(Server.players);
		joinUsers(Server.clients);
	}
	
	public function joinUsers(clientList:List<ClientData>) {
		for( c in clientList ) {
			if( c != this ){
				c.api.userJoin(name);	
				c.api.userWriteStatistics(makeList());
			}
			api.userJoin(c.name);
			api.userWriteStatistics(makeList());
		}
	}
	
	public function makeList():String {
		var text:String = "";
		var i:Int = 1;
		
		for ( c in Server.players)
			text += c.name + " ("+((c.getMark())?"X":"O")+")" + "<br>";
		if ( Server.clients.length > 0) {
			text += "<br>Watching:<br>";
			for ( c in Server.clients )
				text += c.name + "<br>";
		}
			
		return text;
	}
	
	public function getMark () {
		return myMark;
	}
	
	public function switchTurn() {
		ifMyTurn = !ifMyTurn;
	}
	
	public function makeMove(x:Float, y:Float,coordX:Int, coordY:Int) {
		if (Server.players.length > 1){
			if (ifMyTurn) {
				if (gameField[coordX*3+coordY] == 2) {					
					changeTable(coordX,coordY);
					for( c in Server.clients )
						c.api.userMakeMove(myMark,x, y);
					for (c in Server.players) {
						c.api.userMakeMove(myMark,x, y);
						c.switchTurn();
					}
					say("Made his move.");
				}
			} else
			api.userSay(name, "It's not you turn now.");
		}
	}
	
	public function changeTable(x:Int, y:Int) {
		for( c in Server.players )		
			c.gameField[x*3+y] = (myMark)?1:0;
		for( c in Server.clients )
			c.gameField[x*3+y] = (myMark)?1:0;
	}

	public function say( text : String ) {
		for( c in Server.players )
			c.api.userSay(name, text);
		for( c in Server.clients )
			c.api.userSay(name, text);
	}

	public function leave() {
		var success:Bool = Server.clients.remove(this) || Server.players.remove(this);
		if( success ){
			if (Server.players.length < 2 )
				if (Server.clients.length > 1){
				Server.players.add(Server.clients.pop());
				Server.players.last().ifMyTurn = !Server.players.first().ifMyTurn;
				Server.players.last().myMark = !Server.players.first().getMark();
			}
			for( c in Server.clients )
				c.api.userLeave(name);
			for( c in Server.players )
				c.api.userLeave(name);
		}
	}

	public static function ofConnection( scnx : haxe.remoting.SocketConnection ) : ClientData {
		return (cast scnx).__private;
	}

}

// server loop

class Server {

	public static var clients = new List<ClientData>();
	public static var players = new List<ClientData>();

	static function initClientApi( scnx : haxe.remoting.SocketConnection, context : haxe.remoting.Context ) {
		trace("Client connected");
		var c = new ClientData(scnx);
		context.addObject("api",c);
	}

	static function onClientDisconnected( scnx ) {
		trace("Client disconnected");
		ClientData.ofConnection(scnx).leave();
	}

	static function main() {
		var host = "localhost";
		var domains = [host];
		var s = new neko.net.ThreadRemotingServer(domains);
		s.initClientApi = initClientApi;
		s.clientDisconnected = onClientDisconnected;
		
		trace("Starting server...");
		s.run(host,1024);
	}
}
