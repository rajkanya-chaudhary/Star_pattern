public class Palindrome_string {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;
        for(int i = 0;i<str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
            {
                isPalindrome = false;
                break; 
            }
        }
        if(isPalindrome)
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}
