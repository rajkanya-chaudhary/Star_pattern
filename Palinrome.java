public class Palinrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalinrome = true;
        for(int i = 0;i<str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
            {
                isPalinrome = false;
                break;
            }
        }
        if(isPalinrome)
        {  
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}
