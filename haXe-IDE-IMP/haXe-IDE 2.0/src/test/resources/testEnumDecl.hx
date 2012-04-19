enum Cell<T> {
     empty;
     cons( item : T, next : Cell<T> );
}

class List<T> {
        var head : Cell<T>;
/*
        public function new() {
            head = empty;
        }*/

        public function add( item : T ) {
            head = cons(item,head);
        }
/*
        public function length() : Int {
            return cell_length(head);
        }

        private function cell_length( c : Cell<T> ) : Int {
            
            return switch( c ) {
            case empty : 0;
            case cons(item,next): 1 + cell_length(next);
            }
        }*/

    }