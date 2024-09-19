// public class Unique_element {
//         public static void main(String[] args) {
//             String input = "aaaabbcdd";
//             printUniqueCharacters(input);
            
//         }
    
//         public static void printUniqueCharacters(String str) {
//             for (int i = 0; i < str.length(); i++) {
//                 char current = str.charAt(i);
//                 boolean isUnique = true;
    
//                 for (int j = 0; j < str.length(); j++) {
//                     if (i != j && current == str.charAt(j)) {
//                         isUnique = false;
//                         break;
//                     }
//                 }
    
//                 if (isUnique) {
//                     System.out.print(current);
//                 }
//             }
//         }
//     }
public class Unique_element {
public static void main(String[] args) {
        String s = "aabbccdef";
        char[] ch = s.toCharArray();
        int length = ch.length;
        
        for (int i = 0; i < length; i++) {
            char current = ch[i];
            for (int j = i + 1; j < length; j++) {
                if (current == ch[j]) {
                    ch[j] = ' '; 
                }
            }
            if (current != ' ') {
                System.out.print(current);
            }
        }
}    }