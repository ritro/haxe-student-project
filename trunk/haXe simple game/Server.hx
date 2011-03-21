// define a typed remoting API
class ClientApiImpl extends haxe.remoting.AsyncProxy<ClientApi> {
}

// our client class
class ClientData implements ServerApi {

	var api : ClientApiImpl;
	var name : String;	
	var myMark: Bool;
	var ifMyTurn : Bool;

	public function new( scnx : haxe.remoting.SocketConnection ) {
		api = new ClientApiImpl(scnx.client);
		(cast scnx).__private = this;
	}

	public function identify( name : String ) {
		if( this.name != null )
			throw "You are already identified";
		this.name = name;
		Server.clients.add(this);
		
		//true Mark = X, false Mark = O, others just watching
		if (Server.clients.length > 2){
			ifMyTurn = false;
			myMark = true;
		}
			else if (Server.clients.length == 2){
				myMark = false;
				ifMyTurn = false;
				this.api.userAddMouseEvents();
			}
				else {
					this.api.userAddMouseEvents();
					ifMyTurn = true;
					myMark = true;
				}
			
		for( c in Server.clients ) {
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
		
		if (Server.clients.length == 1)
			text = name;
		else 
			for ( c in Server.clients ) {
				if (i == 3)
					text += "<br>Watching:<br>";
				if( c != this ){
					text = text + c.name + "<br>";	
					i++;
				} else {
				text = text + name + "<br>";
				i++;
				}
			}	
			
		return text;
	}
	
	public function getMark () {
		return myMark;
	}
	
	public function switchTurn() {
		ifMyTurn = !ifMyTurn;
	}
	
	public function makeMove(x:Float, y:Float) {
		if (ifMyTurn) {			
			for( c in Server.clients ){
				c.api.userMakeMove(myMark,x, y);
				c.switchTurn();
				say("<b>"+c.name+"</b>" + " made turn");
			}
		}
		say("<b>"+name+"</b>" + " - it's not you turn");
	}

	public function say( text : String ) {
		for( c in Server.clients )
			c.api.userSay(name,text);
	}

	public function leave() {
		if( Server.clients.remove(this) )
			for( c in Server.clients )
				c.api.userLeave(name);
	}

	public static function ofConnection( scnx : haxe.remoting.SocketConnection ) : ClientData {
		return (cast scnx).__private;
	}

}

// server loop

class Server {

	public static var clients = new List<ClientData>();
	public static var gameField = new Array<Array<Int>>();

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
		
		for (i in 1...3) {
				var xxx = new Array<Int>();
				xxx.push(2);
				xxx.push(2);
				xxx.push(2);
				gameField.push(xxx);
			}
		
		trace("Starting server...");
		s.run(host,1024);
	}
}
