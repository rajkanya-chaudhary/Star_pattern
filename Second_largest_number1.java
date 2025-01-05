// public class Second_largest_number1 {
//     public static void main(String[] args) {
//         int a[] = {22,88,33,99,11};
//         int temp = 0;
//         for(int i = 0;i<a.length;i++)
//         {
//             for(int j = i+1;j<a.length;i++)
//             {
//                 if(a[i]<a[j])
//                 {
//                     temp = a[i];
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }
//         System.out.print(a[1]);
//     }
// }
public class Second_largest_number1 {
    public static void main(String[] args) {
        int a[] = {22, 88, 33, 99, 11};
        int temp = 0;
        
        // Sorting the array in descending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {  // Corrected: increment j, not i
                if (a[i] < a[j]) {  // Sort in descending order
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // Printing the second largest element
        System.out.print("Second largest number: " + a[1]);
    }
}

