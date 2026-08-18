import java.util.Arrays;

public static void main(String[] args){
    String str1 = "hello";
    String str2 = "hella";

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    //return Arrays.equals(arr1, arr2);
    System.out.println(Arrays.equals(arr1, arr2));
}