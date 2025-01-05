public class Count_duplicate_element {
    public static void main(String[] args) {
        String str = "i am dimpal chaudhary";
        int n = str.length();
        
        // Manually creating the character array without using toCharArray()
        char ch[] = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i); // Manually assigning characters from the string to the array
        }

        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) { 
            if (visited[i] || ch[i] == ' ') {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(ch[i] + " : " + count);
            }
        }
    }
}

