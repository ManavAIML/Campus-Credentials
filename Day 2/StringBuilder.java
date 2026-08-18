class StringBuilder {
    public static void main(String[] args) {
        String str = "hello students";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}