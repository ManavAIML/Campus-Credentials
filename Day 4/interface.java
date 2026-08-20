// interface 1{
//     void fun();
// }

// class interface2 implements 1{
//     public void fun(){
//         System.out.println("Hello");
//     }
//     void fun2(){
//         System.out.println("World");
//     }
// }

// class interface{
//     public static void main(String args[]){
//         interface2 obj = new interface2();
//         obj.fun();
//         obj.fun2();
//     }
// }


// interface 1{
//     int a = 10;
//     static int y = 20;
//     public final static int z = 30;
// }

// class interface{
//     public static void main(String args[]){
//         interface obj = new interface();
//         System.out.println(obj.a);
//         System.out.println(obj.y);
//         System.out.println(obj.z);
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//         System.out.println(i.x);
//         System.out.println(i.y);
//         System.out.println(i.z);
//     }
// }


// interface i{
//     void fun();
// }
// interface j{
//     void fun();
// }

// class interface implements i,j{
//     public void fun()
//     {   
//         System.out.println("Hello");
//     }
//     public static int fun()
//     {
//         interface obj = new interface();
//         obj.fun();
//         return 0;
//     }
// }


// interface i{
//     void fun();
// }
// interface j{
//     int fun(); //different return type
// }

// class interface implements i,j{
//     public void fun()
//     {   
//         System.out.println("Hello");
//     }
//     public static int fun()
//     {
//         interface obj = new interface();
//         obj.fun();
//         return 0;
//     }
// }

// interface i{
//     void fun();
//     void fun2();
//     // default void fun2(){
//     //     System.out.println("After java 8, we can have default methods in interface");
//     // }
//     // static void fun3(){
//     //     System.out.println("After java 8, we can have static methods in interface");
//     // }
// }


// class interface implements i{
//     public void fun()
//     {   
//         System.out.println("Hello");
//     }
//     public void fun2()
//     {
//         System.out.println("World");
//     }
// }

// class MyClass implements Serializable {
//     // Class implementation
//     private int data;

//     public MyClass(int data) {
//         this.data = data;
//     }

//     public int getData() {
//         return data;
//     }
// }




// import java.io.Serializable;
// public interface Serializable {
//     // This is a marker interface with no methods
// }


// interface i{
//     int x = 10;
//     interface j{
//         int y = 20;
//     }
// }

// class interface implemnets i{
//     public static voidmain(String args[]){
//         interface obj = new interface();
//         System.out.println(obj.x);
//         System.out.println(obj.y);
//         System.outprintln(x);
//         System.out.println(y);
//     }
// }


// interface i{
//     void fun();
//     interface j{
//         void fun2();
//     }
// }

// class interface implemnets i,i,j{
//     public void fun();
//     {

//     }
//     public void fun2(){

//     }
//     public static voidmain(String args[]){
//         interface obj = new interface();
        
//     }
// }


interface i{
    private void fun(){
        System.out.println("private method");
    }
    private static void fun2{}{

    }
    public void fun3(){

    }
    protected void fun4(){

    }
}

class interface implements i{
    public static void main(String args[]){
        interface obj=new interface();
        obj.fun2();
        e.fun1();
    }
}