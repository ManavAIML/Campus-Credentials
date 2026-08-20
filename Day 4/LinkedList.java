//Linear data structure
//Collection of nodes.
//node contains data and next ref pointer variable which stores address of next node

//operattion
//Insertion
//Deletion
//Travse

//Types of link list 
//1. Singly linked list
//2. Doubly linked list
//3. Circular Linked list

//Singly linked list
class node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class LinkedLIst{
    public static void main(String[] args){
        Node start = new Node(10);
        start.next = new Node(20);
        start.next.next = new Node(30);
        start.next.next.next = new Mode(40);
        System.out.print(start.data" ");
        System.out.print(start.next.data" ");
        System.out.print(start.next.next.data"");
        System.out.print(start.next.next.next.data"");
        System.out.print("None");
    }
}