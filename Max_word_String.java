public class Max_word_String {
    public static String maxWord(String str)
    {
        String arr[] = str.split(" ");
        String max = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i].length() > max.length())
            {
                max = arr[i];
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        String str = " dimpal is a software developer";
        System.out.println("maximum word in String = " + maxWord(str));
        
    }
}
