// class A {

// }

// class B{

// }

// interface C{
//     void show();
// }

// abstract class demo implements C{
//     abstract void show();
//     void fun(){
//         System.out.println("Hello");
//     }
// }

// public class Abstract extends demo{
//     public void fun(){
//         System.out.println("Fun method implemented");
//     }
//     public void show(){
//         System.out.println("Show method implemented");
//     }
//     public static void main(String args[]){
//         Abstract d=new Abstract();
//         d.fun();
//     }
// }

// abstract class demo{
//     abstract void show();
//     void fun(){
//         System.out.println("Hello");
//     }
// }

// public class Abstract extends demo{
//     public void fun(){
//         System.out.println("Fun method implemented");
//     }
//     public void show(){
//         System.out.println("Show method implemented");
//     }
//     public static void main(String args[]){
//         Abstract d=new Abstract();
//         d.fun();
//     }
// }

abstract class demo{
    private int a;
    public int getA(){
        return a;
    }
    protected void setA(int a){
        this.a=a;
    }
    default int a;
    abstract void show();
    void fun(){
        System.out.println("Hello");
    }
}