public class Pattern {
    public static void main(String[] args) {
        System.out.println("Print Star");
        int n = 5;
        for(int i = 0; i<=n;i++)
        {
            for(int j = i + 1; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}