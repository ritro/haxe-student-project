class Test {    
    static function main(){
        3+15-- = 25;    //Invalid assign
        var x:Int = 7;  
        x++ - 3 = 51;   //Invalid assign
        x++ = 123;      //Invalid assign
        x = 123--;      //Invalid assign
        x = ++11;       //Invalid assign
        x = 3+(--11);   //Invalid assign
        123-- = 122;    //Invalid assign
    }
}