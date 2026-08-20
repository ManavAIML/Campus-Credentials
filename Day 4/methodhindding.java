class parent{
    void car(){
        System.out.println('Maruti');
    }
}

class child extends parent{
    static void car(){
        System.out.println("BMW");
    }
}

public class methodhindding.java{
    public static void main(String[] args){
        parent c1 = new parent();
        child c2 = new child();
        parent c3 = new parent();
    }
}