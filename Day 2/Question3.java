// to check wheather string is palindrome or not and after that check wheather its anagram or not
class Question1 {
    public static void main(String[] args) {
        String str = "hello students";
        String str2 = "";  // initialize to empty string

        for(int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);  // append characters in reverse order
        }

        if(str.equals(str2)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Check if the string is an anagram of another string
        String str3 = "students hello";  // another string to check for anagram
        
    }
}