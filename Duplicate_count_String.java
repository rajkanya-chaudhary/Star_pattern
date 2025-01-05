public class Duplicate_count_String {
    public static void main(String[] args) {
        String str = "dimpal is a good girl";
        int n = str.length();
        char ch[] = new char[n];
        for(int i = 0;i<n;i++)
        {
            ch[i] = str.charAt(i);
        }
        boolean visited[] = new boolean[n];
        for(int i = 0;i<n;i++)
        {
            if(visited[i] || ch[i] == ' ')
            {
                continue;
            }
            int count = 1;
            for(int j = i+1;j<n;j++)
            {
                if(ch[i] == ch[j])
                {
                    count++;
                    visited[j] = true;
                }
            }
            if(count >1)
            {
                System.out.println(ch[i] + "  : " + count);
            }
        }
        
    
    }
}
