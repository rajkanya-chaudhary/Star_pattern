 public class Min_word_string {

//     public static String minLengthWord(String str) {
//         String arr[] = str.split(" ");
//         String min = arr[0];  // Initialize with the first word in the array
//         for (int i = 1; i < arr.length; i++) {  // Start loop from the second word
//             if (arr[i].length() < min.length()) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }

//     public static void main(String[] args) {
//         String str = "dimpal is a software developer";
//         System.out.println(minLengthWord(str));
//     }
// }
// Maximum length String print
    public static String minLengthWord(String str) {
        String arr[] = str.split(" ");
        String Max = arr[0];  // Initialize with the first word in the array
        for (int i = 1; i < arr.length; i++) {  // Start loop from the second word
            if (arr[i].length() > Max.length()) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        String str = "dimpal is a software developer";
        System.out.println(minLengthWord(str));
    }
}
