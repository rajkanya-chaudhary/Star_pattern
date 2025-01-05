public class Reverse_array_number {
    public static void main(String[] args) {
        int arr[] = {10,22,11,32,77,19};
        int first = 0;
        int last = arr.length-1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            
            first++;
            last--;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
