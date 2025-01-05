public class Linear_search {
    public static void main(String[] args) {
        int a[] = {12,45,76,33,22};
        int key = 76;

        for(int i = 0;i<a.length;i++)
        {
            if(a[i] == key)
            {
                System.out.println("Index Number " + i);
            }
        }
        
    }
}
