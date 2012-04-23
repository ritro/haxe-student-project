package tmp;

import flash.Lib;

class Main 
{
	var foo;
	
	static function myFunction (tmp:Int):void 
	{
		var i:Int = tmp;
		trace("Hello World!"+i);
		foo++;
		bar--;
	}	
	
	var bar;
}