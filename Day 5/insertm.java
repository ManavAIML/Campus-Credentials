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
           System.out.print("\nempty List");   
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
           System.out.println("\nno node to delete");
       }
       else
       {
           Node s=start;
           start=start.next;
           s.next=null;
           s=null;
                 
       }
   }
          
   void deleteNodefromLast()
   {
       if(start==null)
       {
           System.out.println("\nno node available to delete");
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
   void deleteByValue(int key)
   {
       if(start==null)
       {
           System.out.println("\nno node to delete");
       }
       else
       {
           Node s=start;
           Node pre=null;
           while(s!=null)
           {
            if(s.data == key)
            {
                if(pre ==null)
                {
                    start=s.next;
                }
                else
                {
                    pre.next=s.next;
                }
                System.out.println("\nelement found and deleted");
                return;
            }
            pre=s;
            s=s.next;
           }  
           System.out.println("element not found.");
       }
   }
   void insertAtindex(int index)
   {
       if(index <1)
       {
           System.out.println("\ninvalid index ");
       }
       else if(index ==1)
       {
           insertNodeAtFirst();
       }
       else if(index > 1)
       {
           Node s=start;
           for(int i=1;i<index-1;i++)
           {
               if(s == null || s.next== null)
               {
                   System.out.println("\nindex out of bounds");
                   return;
               }
               s=s.next;
           }
           
           Node temp=createNode();
           temp.next=s.next;
           s.next=temp;  
                   
       }
           
   }
    void deleteFromIndex(int index)
   {
       if(index <1)
       {
           System.out.println("\ninvalid index ");
       }
       else if(index ==1)
       {
           deleteNodefromFirst();
       }
       else if(index > 1)
       {
           Node s=start;
           for(int i=1;i<index-1;i++)
           {
               if(s == null || s.next== null)
               {
                   System.out.println("\nindex out of bounds");
                   return;
               }
               s=s.next;
           }
           
           if(s.next!=null)
               s.next=s.next.next;
                   
       }
           
   }
    
    void Search(int key)
    {
        if(start==null)
        {
            System.out.println("data not found empty list");
        }
        else
        {
            Node s=start;
            while(s!=null)
            {
                if(s.data==key)
                {
                    System.out.println("\ndata found");
                    return;
                }
                s=s.next;
            }
            System.out.println("\ndata not found");           
        }
    }
    public static void main(String[] args) 
    {
        LinkedList l1=new LinkedList();
//        l1.insertNodeAtFirst();
//        l1.insertNodeAtFirst();
//        l1.insertNodeAtFirst();
        l1.insertNodeAtLast();
        l1.insertNodeAtLast();
        l1.insertNodeAtLast();
        l1.insertNodeAtLast();

        l1.display();
//        l1.deleteNodefromFirst();
//        l1.deleteNodefromLast();
//        l1.deleteByValue(30);
//        l1.insertAtindex(3);
//        l1.deleteFromIndex(10);
         l1.Search(3);
        System.out.println("  ");
//        l1.display();
 
    }
   
}