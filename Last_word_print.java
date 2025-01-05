// public class Last_word_print {
//     public static void main(String[] args) {
//         String str = "hi dimpal chuadhary from gorkhpur";
// 	        int len = str.length();
// 	        int lastIndex = -1;
// 	        for (int i = len - 1; i >= 0; i--) {
// 	            if (str.charAt(i) == ' ') {
// 	                lastIndex = i;
// 	                break;
// 	            }
// 	 }   
// 	        if (lastIndex != -1) {
// 	            for (int i = lastIndex + 1; i < len; i++) {
// 	                System.out.print(str.charAt(i));
// 	            }
// 	        } else {
// 	            System.out.println(str);
// 	        }
//     }
// }
public class Last_word_print {
public static void main(String[] args) {
       String str = "This is a test string dimpalch";
        int count = 0;
        boolean word = false;

      
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

       
            if (ch !=' ') {
                count++;
                word = true;
            }
            else if (ch == ' ' && word) {
                break;
            }
        }

        System.out.println("Last word length: " + count);
   }
}    