package Yntaciq.welist;

 class List {
    int size = 0;
    Node head = null;
    Node tale;
    void add(int val){
        if(head == null){
            head = new Node(val);
            tale = head;
            size++;
        }else{
            head.pNext = new Node(val);
            head = head.pNext;
            size++;
        }
    }
    void print(){
        Node temp = tale;
        for (int i = 0; i <size ; i++) {
            System.out.print(temp.data);
            temp = temp.pNext;
        }
    }
    class Node{
        private int data;
        private Node pNext = null;
        Node(int data){
            this.data = data;
        }
    }
}
