public class Duplicate {
    public static void main(String[] args) {
        String str = "aabbnndddiee";
        int n = str.length();
        char ch[] = new char[n];
        for(int i = 0;i<n;i++)
        {
            ch[i] = str.charAt(i);
        }
        int length = ch.length;
        for(int i = 0;i<ch.length;i++)
        {
            char current = ch[i];
            for(int j = i+1;j<ch.length;j++)
            {
                if(ch[i] == ch[j])
                {
                    ch[j] = ' ';
                }
            }
            if(ch[i] != ' ')
            {
                System.out.print(ch[i]);
            }
        }
    }
}
