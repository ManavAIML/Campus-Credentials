class node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class LinkedLIst{
    void display(Node s){
        if(s == 0){
            System.out.println("Empty list")
        }
        else{
            while(s!=NULL){
                System.out.println(s.data+"->");
                s=s.next;
            }
        }

    }
    public static void main(String[] args){
        Node start = new Node(10);
        start.next = new Node(20);
        start.next.next = new Node(30);
        start.next.next.next = new Mode(40);
        // System.out.print(start.data" ");
        // System.out.print(start.next.data" ");
        // System.out.print(start.next.next.data"");
        // System.out.print(start.next.next.next.data"");
        // System.out.print("None");
        l1.display(start);
    }
}