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

public class LinkedList 
{ 
   Node start;
   
   Node createNode()
   { 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter data");
       int data=sc.nextInt();
       return new Node(data);
       
   }
   
   void insertNodeAtFirst()
   {
       if(start==null)
       {
        start=createNode();   
       }
       else
       {
           Node temp=createNode();
           temp.next=start;
           start=temp;
        }
       
   }
   
   void insertNodeAtLast()
   {
       if(start==null)
       {
           start=createNode();
       }
       else
       {
          Node s=start;
          while(s.next != null)
          {
              s=s.next;
          }
          s.next=createNode();
       }
               
   }
   
   void display()
   {
       Node s=start;
       if(s == null)
       {
           System.out.print("empty List");   
       }    
       else{
       while(s!=null)
       {
           System.out.print(s.data+"->");
           s=s.next;
       }
       System.out.print("null"); 
       }
       
   } 
  
   void deleteNodefromFirst()
   {
       if(start==null)
       {
           System.out.println("no node to delete");
       }
       else
       {
           Node s=start;
           start=start.next;
           s.next=null;
           s=null;
                 
       }
    }

    // void deleteNodeByValue(int value) {
    // if (start == null) {
    //     System.out.println("No node to delete");
    //     return;
    // }

    // if (start.data == value) {
    //     start = start.next;
    //     return;
    // }

    // Node prev = null;
    // Node curr = start;

    // while (curr != null && curr.data != value) {
    //     prev = curr;
    //     curr = curr.next;
    // }

    // if (curr == null) {
    //     System.out.println("Value not found in list");
    //     return;
    // }

    // prev.next = curr.next;
    // }


    void deleteByvalue(int key){
        if(start == null){
            System.out.println("no node");
        }
        else{
            Node n = start;
            Node pre = null;
            while(s!= null){
            if(s.data == key){
                if(pre == null){
                    start = s.next;
                }
                else{
                    pre.next = s.next;
                }
                break;
                System.out.println(Element found and deleted);
            }
            
            pre = s;
            s= s.next;
        }
        System.out.println("elemnt not found");

        }
    }

          
   void deleteNodefromLast()
   {
       if(start==null)
       {
           System.out.println("no node available to delete");
       }
       else if(start.next == null)
       {
           start=null;
       }
       else
       {
           Node s=start;
           while(s.next.next != null)
           {
               s=s.next;
           }
           s.next=null;
                  
       }
    }

    void search(int ele){
        if(start = null){
            System.out.println("Null");
        }
        else{
            Node s=start;
            while(s!=null){
                if(s.data == ele){
                    System.out.println("Found");
                    return
                }
                s= s.next;
            }
            System.out.println("Not Found");
        }
    }

    void insertatmiddle(int idx){
        if(idx <1){
            System.out.println("invalid index");
        }
        else if(idx == 1){
            insertnodeatfirst();
        }
        else if(idx > 1){
            Node s= start;
            for(int i =1; i< idx -1;i++){
                if(s==null || s.next == null){
                    System.out.println("out of bound");
                }
                s = s.next;
            }
            Node temp = createNode();
            temp.next = s.next;
            s.next = temp;
        }
    }

     void delteatfirst(int idx){
        if(idx <1){
            System.out.println("invalid index");
        }
        else if(idx == 1){
            insertnodeatfirst();
        }
        else if(idx > 1){
            Node s= start;
            for(int i =1; i< idx -1;i++){
                if(s==null || s.next == null){
                    System.out.println("out of bound");
                    return;
                }
                s = s.next;
            }
            if(s.next!=null){
                s.next = s.next;
            }
        }
    }

    public static void main(String[] args) 
{
        LinkedList l1=new LinkedList();
//        l1.insertNodeAtFirst();
//        l1.insertNodeAtFirst();
//        l1.insertNodeAtFirst();
        l1.insertNodeAtLast();
//        l1.insertNodeAtLast();
//        l1.insertNodeAtLast();
//        l1.insertNodeAtLast();

        l1.display();
//        l1.deleteNodefromFirst();
        l1.deleteNodefromLast();
        System.out.println("  ");
        l1.display();
 
    }
   
}