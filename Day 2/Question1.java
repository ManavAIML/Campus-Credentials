// to print a string in reverse using recursion

// class Question1 {
//     public static void main(String[] args) {
//         String str = "hello students";
//         for(int i = 0 ; i < str.length(); i++) {
//             System.out.print(str.charAt(str.length() - 1 - i));
//         }
//     }
// }

// to print a string in reverse using recursion

// class Question1 {
//     public static void main(String[] args) {
//         String str = "hello students";
//         String str2 = "";  // initialize to empty string

//         for(int i = str.length() - 1; i >= 0; i--) {
//             str2 += str.charAt(i);  // append characters in reverse order
//         }

//         System.out.println(str2);
//     }
// }

void Swap(String str, int s, int e){
    char[] arr = str.toCharArray();
    char temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
}

public class Question1 {
    public static void naim(String[] args){
        String str = "hello students";
        char arr[] = str.toCharArray();
        int s = 0;
        int e = str.length() - 1;

        while(s < e){
            swap (str, s, e);
            s++;
            e--;
        }
        System.out.println(arr);
    }
}
