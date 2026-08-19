package sbmp;



public class packages {

    class P{
        p(){
            System.out.println("P constructor");
        }
    }
    public class javaint {
        static{
        System.out.println("Hello, World!");
        }
        javainit(){
            System.out.println("Hiii");
        }
    }
    public static void main(String[] args) {
        javaint obj = new javaint();
    }
}