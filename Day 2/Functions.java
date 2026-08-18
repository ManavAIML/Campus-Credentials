class Functions {
    public static class Function {
        void msg() {
            System.out.print("Hello, World!!!!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Function f1 = new Function();  // works now
        f1.msg();
    }
}
