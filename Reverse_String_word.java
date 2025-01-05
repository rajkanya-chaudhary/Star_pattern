//public class Reverse_String_word {
//     public static void main(String[] args) {
//         String str = "dimpal";
//         String rev = "";
//         for(int i = str.length()-1;i>=0;i--)
//         {
//             rev = rev + str.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }
public class Reverse_String_word {
    public static void main(String[] args) {
        String input = "aaaabbcdd";
        public static void printUniqueCharacters(String str) {
                 for (int i = 0; i < str.length(); i++) {
                     char current = str.charAt(i);
                     boolean isUnique = true;
        
                     for (int j = 0; j < str.length(); j++) {
                         if (i != j && current == str.charAt(j)) {
                             isUnique = false;
                             break;
                         }
                     }
        
                     if (isUnique) {
                         System.out.print(current);
                     }
                 }
             }
         }
}     }  