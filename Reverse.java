public class Reverse {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
      //  System.out.println(rev);
      if(str.equals(rev))
      {
        System.out.println("Palindrome String");
      }
      else
      {
        System.out.println("Not Palindrome String");
      }

    }
}
