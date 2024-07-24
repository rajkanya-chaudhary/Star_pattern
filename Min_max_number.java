 public class Min_max_number {
    public static int maxMin(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max; // Return the maximum value found
    }

    public static void main(String[] args) {
        int arr[] = {12, 33, 55, 77, 99};
        int maxValue = maxMin(arr);
        System.out.println("Max value in array: " + maxValue);
    }
}
