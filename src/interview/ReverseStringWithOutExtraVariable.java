package interview;

public class ReverseStringWithOutExtraVariable {
     private static String reverse(String str)
    {
         if (str == null || str.equals(""))
            return str;
         return str.charAt(str.length() - 1) +reverse(str.substring(0, str.length()-1));
    }
 
    public static void main (String[] args)
    {
        String str = "Techie Delight";
 
        str = reverse(str);
 
        System.out.println("Reverse of the given string is : " + str);
    }

}