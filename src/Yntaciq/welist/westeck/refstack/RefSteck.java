package Yntaciq.welist.westeck.refstack;

public class RefSteck {
    RefSteck(){

    }
    int size = 0;
    Node head = null;
    void push(int val) {
        if (head == null) {
            head = new Node(val);
            size++;
        } else {
            head.PNext = new Node(val);
            head.PNext.prev = head;
            head = head.PNext;
            size++;
        }
    }
    int pop(){
        int temp = head.data;
        head = head.prev;
       --size;
       return  temp;
    }

    public static void main(String[] args) {
        RefSteck refSteck = new RefSteck();
        RefSteck a= new RefSteck();
    }

    class Node{
        private int data;
        private Node PNext = null;
      private  Node prev;
        Node(int data){
            this.data = data;
        }

    }
}
