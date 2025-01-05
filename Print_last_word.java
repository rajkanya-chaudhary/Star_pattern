public class Print_last_word {
    public static void main(String[] args) {
        String str = "dimpla chaudhary is a good girl";
        int n = str.length();
        int lastIndex = -1;
        for(int i = n-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                lastIndex = i;
                break;
            }
        }
        if(lastIndex != ' ')
        {
            for(int i = lastIndex +1;i<n;i++)
            {
                System.out.print(str.charAt(i));
            }
            
        }
        else
        {
            System.out.println(str);
        }
    }
}
