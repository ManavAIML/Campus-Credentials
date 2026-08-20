// //Single
// // multiple
// // multilevel
// // hybrid (except multiple)
// // hierarchical

// //Single
// // class parent{
// //     void home(){
// //         System.out.println("Parent here");
// //     }
// // }

// // class child extends parent{
// //     void room(){
// //         System.out.println("CHild");
// //     }
// // }

// // class inheritance{
// //     public static void main(String[] args){
// //         child ch=new child();
// //         ch.home();
// //     }
// // }

// //Mulitple 

// import java.util.*;
// class person{
//     void info(String name, int age){
//         System.out.println("Name is"+name);
//         System.out.println("Age is "+age);
//     }
// }

// class stu extends person{
//     void mrk(int roll_no,String sub, int marks, String name, int age){
//         System.out.println("Roll no is"+roll_no);
//         System.out.println("Sunject is"+sub);
//         System.out.println("Marks are "+marks);
//         super.info(name, age);
//     }
// }

// class tch extends person{
//     void sly(int sly, String dep, int id, String name, int age){
//         System.out.println("Salary is"+sly);
//         System.out.println("department is "+dep);
//         System.out.println("ID is"+id);
//         super.info(name, age);
//     }
// }

// class inheritance{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String name = sc.nextLine();
//         int age = sc.nextInt();
//         int roll = sc.nextInt();
//         String sub = sc.nextLine();
//         int marks = sc.nextInt();
//         int sly = sc.nextInt();
//         String dep = sc.nextLine();
//         int id = sc.nextInt();

//         stu st=new stu(roll, sub, marks, name, age);
//         tch th=new tch(sly, dep, id, name, age);
//         st();
//         th();

//     }
// }
class Person
{
    int age;
    String name;

    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    
}
class Student extends Person
{
    int m1,m2,m3,roll,total;
    float per;
    Student(String name, int age,int roll,int m1,int m2,int m3)
    {
        super(name,age);
        this.roll=roll;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void DisplayS()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
        total=m1+m2+m3;
        System.out.println(total);
        per=total/3;
        System.out.println(per);
    }
    
    
}
class Teacher extends Person
{
    int id,sal;
    String dept;
    Teacher(String name,int age,int id,int sal,String dept)
    {
        super(name,age);
        this.id=id;
        this.sal=sal;
        this.dept=dept;
    }
    void DisplayT()
    {
        System.out.println(name);
        System.out.println(age); 
        System.out.println(id);
        System.out.println(sal); 
        System.out.println(dept);

    }
    
}
public class OOP 
{
    public static void main(String[] args) {
       Student s1=new Student("raj",20,1,89,78,98);
       s1.DisplayS();
       Teacher t1=new Teacher("mr.patil",50,101,3000,"IT");
       t1.DisplayT();
    }
}