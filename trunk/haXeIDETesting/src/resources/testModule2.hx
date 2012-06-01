/**
 * Several useful functions
 * @author Victor Polozov
 */

package pkg;

class TestModule2 {
    /* A way to deal with Xml.elements(), which returns Iterator<Xml> instead of Iterable<> */
    public static function makeIterable<T>(it: Void -> Iterator<T>): Iterable<T> {
        return { iterator: it };
    }

    public static function elements(node : Xml) : Iterable<Xml> { 
        return makeIterable(node.elements);
    }

    public static function elementsNamed(node : Xml, name : String) : Iterable<Xml> { 
        return makeIterable(callback(node.elementsNamed, name)); 
    }

    public static function getAttribute(attribute : String) : Xml -> String {
        return function (node : Xml) { return node.get(attribute); };
    }

    public static function splitBy<A>(it : Iterable<A>, f : A -> Bool) : List<List<A>> {
        var res = new List<List<A>>();
        var cur = new List<A>();
        res.add(cur);

        for (el in it) {
            if (f(el)) {
                cur = new List<A>();
                res.add(cur);
            } else {
                cur.add(el);
            }
        }
        return res;
    }

    public static function isSpace(ch : String) : Bool {
        return ch == " ";
    }

    public static function sum( it : Iterable<Float> ) : Float {
         return Lambda.fold(it, function (f, a) { return f + a; }, 0);
    }

    public static function max( it : Iterable<Float> ) : Float {
         return Lambda.fold(it, Math.max, Math.NEGATIVE_INFINITY);
    }

    public static function min( it : Iterable<Float> ) : Float {
         return Lambda.fold(it, Math.min, Math.POSITIVE_INFINITY);
    }
}
