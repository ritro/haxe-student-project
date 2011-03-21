import flash.display.DisplayObject;
import flash.display.Shape;
import flash.display.Sprite;
import flash.events.ActivityEvent;
import flash.events.Event;
import flash.events.KeyboardEvent;
import flash.events.MouseEvent;
import flash.Lib;
import flash.text.TextField;
import flash.text.TextFieldAutoSize;
import flash.text.TextFieldType;
import flash.Vector;
import haxe.Int32;

class ServerApiImpl extends haxe.remoting.AsyncProxy<ServerApi> {
}

class Client implements ClientApi {

	var api : ServerApiImpl;
	var name : String;
	var mc:Shape;
	var tf : TextField;
	var lable : TextField;
	var list: TextField;
	var field:Sprite;
	
	static var hght_wdth:Float = 50;
	static var start_crd:Float = 5;

	function new() {
		var s = new flash.net.XMLSocket();
		s.addEventListener(Event.CONNECT, onConnect);
		s.connect("localhost",1024); 
		var context = new haxe.remoting.Context();
		context.addObject("client",this);
		var scnx = haxe.remoting.SocketConnection.create(s, context);
		flash.system.Security.allowDomain('*');
        flash.system.Security.allowInsecureDomain("localhost");
		api = new ServerApiImpl(scnx.api);
	}

	function onConnect( success : Bool ) {
		if( !success ) {
			trace("Failed to connect on server !");
			return;
		}
		createGameField();
		
		// create an input textfield
		tf = new TextField();
		tf.x = start_crd;
		tf.y = start_crd + hght_wdth*3 + 10;
		tf.height = 20;
		tf.width = hght_wdth*3 +start_crd + 200;
		tf.name = "tf";
		flash.Lib.current.addChild(tf);
		tf.type = TextFieldType.INPUT;
		tf.border = true;
		tf.background = true;
		tf.backgroundColor = 0xEEEEEE;
		Lib.current.addEventListener(KeyboardEvent.KEY_DOWN, onKeyDown);
		
		lable = new TextField();
		lable.x = start_crd;
		lable.y = start_crd + hght_wdth*3 + 30;
		lable.height = 120;
		lable.width = hght_wdth*3 +start_crd + 200;
		lable.name = "lable";
		flash.Lib.current.addChild(lable);
		lable.border = false;
		lable.background = false;
		lable.multiline = true;
		
		list = new TextField();
		list.x = hght_wdth*3 + start_crd +10;
		list.y = start_crd;
		list.height = hght_wdth*3 + start_crd;
		list.width = 190;
		list.name = "list";
		flash.Lib.current.addChild(list);
		list.border = true;
		list.background = false;		
		list.multiline = true;
		
		display("Please enter your name in the textfield to login and press ENTER");
	}
	
	function createGameField() {		
		var color1:UInt = 0xF0F8FF;
		var color2:UInt = 0x8FBC8F;
		
		mc = new Shape();
		mc.graphics.beginFill( color1);
		mc.graphics.drawRect(start_crd, start_crd, hght_wdth, hght_wdth );
		mc.graphics.endFill();
		mc.graphics.beginFill( color2);
		mc.graphics.drawRect( start_crd+hght_wdth, start_crd, hght_wdth, hght_wdth );
		mc.graphics.endFill();
		mc.graphics.beginFill( color1);
		mc.graphics.drawRect( start_crd+2*hght_wdth, start_crd, hght_wdth, hght_wdth );
		mc.graphics.endFill();
		mc.graphics.beginFill( color2);
		mc.graphics.drawRect(start_crd, start_crd+hght_wdth, hght_wdth, hght_wdth );
		mc.graphics.endFill();
		mc.graphics.beginFill( color1);
		mc.graphics.drawRect( start_crd+hght_wdth, start_crd+hght_wdth, hght_wdth, hght_wdth );
		mc.graphics.endFill();
		mc.graphics.beginFill( color2);
		mc.graphics.drawRect( start_crd+2*hght_wdth, start_crd+hght_wdth, hght_wdth, hght_wdth);
		mc.graphics.endFill();
		mc.graphics.beginFill( color1);
		mc.graphics.drawRect(start_crd, start_crd+2*hght_wdth, hght_wdth, hght_wdth);
		mc.graphics.endFill();
		mc.graphics.beginFill( color2);
		mc.graphics.drawRect( start_crd+hght_wdth, start_crd+2*hght_wdth, hght_wdth, hght_wdth );
		mc.graphics.endFill();
		mc.graphics.beginFill( color1);
		mc.graphics.drawRect( start_crd+2*hght_wdth, start_crd+2*hght_wdth, hght_wdth, hght_wdth );
		mc.graphics.endFill();
		
		field = new Sprite();
		field.addChild(mc);
		Lib.current.addChild(field);
	}

	public function userMakeMove(mark:Bool,x:Float, y:Float) {
		if (mark){
			mc.x = x +5;
			mc.y = y +5;
			mc.graphics.lineStyle(3, 0);
			mc.graphics.lineTo(x - 10 + hght_wdth, y - 10 + hght_wdth);
			mc.x = x + hght_wdth - 5;
			mc.graphics.lineTo(x - hght_wdth - 10, y - 5 );
		}
		else {
			mc.graphics.drawCircle(x+hght_wdth/2, y +hght_wdth/2, hght_wdth/2 - 7);
		}
	}
	
	function onKeyDown(e:KeyboardEvent) {
		// ENTER pressed ?
		if( e.keyCode == 13 ) {
			var text = tf.text;
			tf.text = "";
			send(text);
		}
	}

	function onMouseDown(e:MouseEvent) {
		var x:Float = (e.localX % hght_wdth) * hght_wdth;
		var y:Float = (e.localY % hght_wdth) * hght_wdth;
		
		api.say(x+":"+y);
		
		if ( e.buttonDown && (x < hght_wdth * 3 + start_crd && y < hght_wdth * 3 + start_crd
							&& x > start_crd && y>start_crd) )
		{
			api.makeMove(x,y);			
		}
	}

	function send( text : String ) {
		if( name == null ) {
			name = text;
			api.identify(name);
			return;
		} 
		api.say(text);
	}
	
	public function userWriteStatistics( players:String) {
		list.htmlText = "Playing: <br>" + players;
	}
	
	public function userAddMouseEvents() {
		field.addEventListener(MouseEvent.MOUSE_DOWN, onMouseDown);
	}

	public function userJoin( name ) {
		display("User join <b>"+name+"</b>");
	}

	public function userLeave( name ) {
		display("User leave <b>"+name+"</b>");
	}

	public function userSay( name : String, text : String ) {
		display("<b>"+name+ " :</b> "+text.split("&").join("&amp;").split("<").join("&lt;").split(">").join("&gt;"));
	}

	function display( line : String ) {
		var bottom = (lable.maxScrollV == lable.maxScrollV);
		lable.htmlText += line + "<br>";
		if( bottom )
			lable.scrollV = lable.maxScrollV;
	}

	// --
	static var c : Client;

	static function main() {
		c = new Client();
	}

}
