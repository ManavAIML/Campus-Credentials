//Abstraction is the process of hiding implementation details and showing only the essential features of an object to the user

//Show what to do, Hide how it is done = abstraction
//2 ways to Achieve abstraction:
//1. Abstract class
//2. Interface

class boss{
    abstract void task();
    void sal(){
        System.out.println("sal department");
        }
}
class emp extends boss{
    void task(){
        System.out.println("task complete");
    }
}

public class Abstraction {
    public static void main(String[] args){
            emp e1=new emp();
            e1.sal();
    }
}