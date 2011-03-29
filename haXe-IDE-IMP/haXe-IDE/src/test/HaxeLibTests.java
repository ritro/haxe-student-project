package test;

import static test.TestHelper.parseFunction;
import static test.TestHelper.parseExpression;
import static test.TestHelper.parseStatement;
import static test.TestHelper.parseModule;

import java.text.ParseException;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class HaxeLibTests {

	@Test
	public void testFunction() throws RecognitionException {
		parseFunction("public static function trace( str : String ) { untyped __trace__(str); }");
		parseFunction("public inline static function getTimer() : Int {return untyped __global__[\"flash.utils.getTimer\"](); }");
		parseFunction("public static function getURL( url : String, ?target : String ) { untyped __geturl__(url,if( target == null ) \"_self\" else target); }");	
		parseStatement("untyped __geturl__(url,if( target == null ) \"_self\" else target);");
		parseExpression("untyped __geturl__(url,if( target == null ) \"_self\" else target)");
	}
	
	//this test fails...
	@Test
	public void testSHA1() throws RecognitionException {
		//parseStatement("var nblk = ((s.length + 8) >> 6) + 1;");
		//parseExpression("((s.length + 8) >> 6) + 1");
		parseExpression("(s.length + 8)").printTree(); // OK
		parseExpression("((s.length + 8) >> 6)").printTree(); // Fail
		
	}
	
	@Test
	public void testMeta() throws RecognitionException {
		parseModule("@:core_api  class Date { }");
		parseModule("@:core_api extern private class DateEx { }");
		parseModule("@:require(flash10) extern class Vector<T> implements ArrayAccess<T> { }");
	}

	@Test
	public void testTypeparam() throws RecognitionException {
		parseModule("class C<T> { }");		
		parseModule("class C<K<V>> { }");
		parseModule("class C<K<V> > { }");
		parseModule("class C<K<V<T>>> { }");
		parseModule("class C<K<V<T> > > { }");
		parseModule("class C<K<V<T<U>>>> { }");
		parseModule("class C<K<V<T<U>> >> { }");
		parseModule("class C<K<V<T<U> > > > { }");

		parseModule("class C<K,V> { }");
	}
	
}
