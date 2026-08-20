//Method overloading
//a class have exactly same name and different paameters method 

// class test{
//     void add(int a, int b){
//         int c = a + b;
//         System.out.println("Addition of two numbers"+c);
//     }
//     void add(int a, int b, int d){
//         int c = a + b + d;
//         System.out.println("Addition of two numbers"+c);
//     }
// }

// class Polymorphism{
//     public static void main(String[] args){
//         test t1=new test();
//         t1.add(10,20);
//         t1.add(10,20,30);
//     }
// }



class test{
    test(){
        System.out.println("default");
    }
    test(int a){
        System.out.println("parameterized");
    }
}

class Polymorphism{
    public static void main(String[] args){
        test t1=new test();
        test t1 = new test(12);
    }
}
