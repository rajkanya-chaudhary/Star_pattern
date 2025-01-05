public class Missing_element {
    public static void missElement(int a[],int b[])
    {
        for(int i = 0;i<a.length;i++)
        {
            boolean found = false;
            for(int j = 0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                System.out.println(a[i] + " "); 
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {2,3,1,0,5};
        System.out.print("Elements in array a that are not in array b: ");
        missElement(a, b);


    }
}
