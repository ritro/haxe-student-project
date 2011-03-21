interface ServerApi {
	public function identify( name : String ) : Void;
	public function say( text : String ) : Void;
	public function getMark () :Bool;
	public function switchTurn() : Void;
	public function makeMove( x:Float, y:Float):Void;
}
