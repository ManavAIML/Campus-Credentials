// both class having parent child relationship and have exactly same name and same parameter method 
class parent{
    void car(){
        System.out.println("maruti");
    }
}
class child extends parent{
    void car(){
        System.out.println("BMW");
    }
}

class Polymorphismoveriding{
    public static void main(String[] args){
        child ch = new child();
        ch.car();
    }
}


