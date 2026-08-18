// extract vowels from a string
// class Question2 {
//     public static void main(String[] args) {
//         String str = "hello students";
//         String vowels = "";  // initialize to empty string

//         for(int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                 vowels += ch;  // append vowel characters
//             }
//         }

//         System.out.println("Vowels in the string: " + vowels);
//     }
// }

// extract consonants from a string
class Question2 {
    public static void main(String[] args) {
        String str = "hello students";
        String consonants = "";  // initialize to empty string

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') && 
               !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                consonants += ch;  // append consonant characters
            }
        }

        System.out.println("Consonants in the string: " + consonants);
    }
} 