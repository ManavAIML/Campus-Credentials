/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node pre;
    Node(int data)
    {
        this.data=data;
    }
    
}
public class DLL     
{
    Node start;
    
    Node createNode()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data");
        int data=sc.nextInt();
        return new Node(data); // address of that node
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
            start.pre=temp;
            start=temp;
        }
    }
    void insertAtLast()
    {
        if(start==null)
        {
            start=createNode();
        }
        else
        {
            Node s=start;
            while(s.next !=null)
            {
                s=s.next;   
            }
            s.next=createNode();
            s.next.pre=s;    
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
           start.pre=null;
                 
       }
   }
    void displayNode()
    {
        if(start==null)
        {
            System.out.println("\nno node avialable");
        }
        else
        {
            Node s=start;
            while(s!=null)
            {
                System.out.print(s.data+"<-->");
                s=s.next;
            }
            System.out.print("None");
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
           s.next.pre=null;
           s.next=null;
                  
       }
   }
    
    void reverse()
    {
        if(start==null)
        {
            System.out.println("no node to reverse");
        }
        else
        {
           Node s=start;
           while(s.next!=null)
           {
               s=s.next;
           }
           while(s!=null)
           {
               System.out.print(s.data+"<-->");
               s=s.pre;
           }
        }
    }
    public static void main(String[] args) {
        DLL d1=new DLL();
        d1.insertNodeAtFirst();
        d1.insertNodeAtFirst();
        d1.insertNodeAtFirst();
        d1.insertNodeAtFirst();
        d1.displayNode();
        System.out.println("");
        d1.reverse();
//        d1.deleteNodefromFirst();
//        System.out.println(" ");
//        d1.displayNode();
        
    }
    
}