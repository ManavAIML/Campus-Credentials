/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class CLL 
{
    Node start;
    Node createNode()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data1");
        int data=sc.nextInt();
        return new Node(data);
    }
    void insertNodeAtFirst()
    {
        if(start==null)
        {
            start=createNode();
            start.next=start;
        }
        else
        {
            Node s=start;
            Node temp=createNode();
            temp.next=start;
            while(s.next!=start)
            {
                s=s.next;
            }
            s.next=temp;
            start=temp;
        }
    }

    void insertNodeAtLast(){
        if(start == null){
            start = createNode();
            start.next= start;
        }
        else{
            Node s = start;
            Node temp = createNode();
            while(s.next == start){

            }
        }
    }

    void delete(){

    }
         
    void display()
    {
        if(start==null)
        {
            System.out.println("no node available");
        }
        else
        {
            Node s=start;
            do
            {
                System.out.print(s.data+" ");
                s=s.next;
            }
            while(s!=start);
        }
                    
    }
    
    public static void main(String[] args) {
        CLL c1=new CLL();
        c1.insertNodeAtFirst(); 
        c1.insertNodeAtFirst();
        c1.insertNodeAtFirst();
        c1.display();
        
    }           
}