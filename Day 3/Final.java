// public class Final {
//     final int a;

//     public static void main(String[] args) {
//         Final obj = new Final();
//         obj.a = 10;
//         System.out.println(obj.a);
//     }
// }


// public class Final {
//     final int a;
//     Final()
//     {
//         a = 10;
//     }
//     Final(int x)
//     {
//         // this();
//         a = x;
//     }

//     public static void main(String[] args) {
//         Final obj = new Final();
//         Final obj1 = new Final(20);
//         obj.a = 10;
//         System.out.println(obj.a);
//     }
// }


// public class Final {
//     // final static int a = 10; // Initialize the static final variable at the time of declaration
//     final static int a; // Declare the static final variable without initialization
//     static {
//         a = 20; // This line would cause a compilation error because 'a' is final and cannot be reassigned
//     }
//     public static void main(String[] args) {
//         System.out.println(Final.a); // Access the static final variable using the class name
//     }
// }

// public class Final {
//     final static int a; // Declare the static final variable without initialization
//     Final(){
//         a = 10;
//     }
//     void fun(){
//         int a = 10;
//         static int b = 20;
//     }
//     public static void main(String[] args) {
//         System.out.println(Final.a); // Access the static final variable using the class name
//     }
// }

public class Final{
    void void fun(){
        
    }
    void car(){

    public static void main(String[] args) {
        Final obj = new Final();
        obj.fun();
    }
}