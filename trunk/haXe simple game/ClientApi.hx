interface ClientApi {
	public function userJoin( name : String ) : Void;
	public function userLeave( name : String ) : Void;
	public function userSay( name : String, text : String ) : Void;
	public function userMakeMove( mark:Bool, x:Float, y:Float):Void;
	public function userWriteStatistics( players:String):Void;
	public function userAddMouseEvents () : Void;
}
