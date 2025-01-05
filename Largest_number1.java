public class Largest_number1 {
    public static void main(String[] args) {
        int a[] = {2,4,7,8,4,1};
        int largest = a[0];
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
