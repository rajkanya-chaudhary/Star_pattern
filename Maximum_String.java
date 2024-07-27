public class Maximum_String {
    public static String maxLengthWord(String str)
    {
       String arr[] = str.split(" ");
       String Max = arr[0];
       for(int i = 1;i<arr.length;i++)
       {
        if(arr[i].length()>Max.length())
        {
            Max = arr[i];
        }
       } 
       return Max;
    }
    public static void main(String[] args) {
        String str = "dimpal is a software developer";
        System.out.println(maxLengthWord(str));
    }
}
