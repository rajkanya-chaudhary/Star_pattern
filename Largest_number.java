public class Largest_number {
    public static void main(String[] args) {
        int a[] =  { 3,5,8,5,1};
        int largest = a[0];
        for(int i = 1;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
        }
        System.out.println("largest number in Array  = " + largest);

    }
}
