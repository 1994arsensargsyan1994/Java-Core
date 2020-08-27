package leson8.dynamic;

public class Stack<T> {
        private  static  final int  DEFAULT_CAPACITY = 16;
        private Object[] storage;
        private  int tos;

        public Stack() {

            this(DEFAULT_CAPACITY);
        }

        public Stack(int capacity) {

            init(capacity);
        }
        private void init(int capacity ){
            this.storage = new Object[capacity];
            this.tos = -1;
        }
        public void push(T value) {
            if (tos ==storage.length-1){
            }
            storage[++tos] = value;

        }

        public T pop() {

            return tos < 0 ?null: (T)storage[tos--];
        }
        public boolean isEmpty(){
            return tos < 0;
        }
        public void  clear(){
            init(DEFAULT_CAPACITY);
        }


    }
