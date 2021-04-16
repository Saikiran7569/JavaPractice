package DS;
import java.util.Arrays;
import java.util.TreeSet;
 
public class JoinArray 
{
  public static void main(String[] args) 
  {
    Integer[] array1 = {0,2,4,6,8};
      Integer[] array2 = {1,3,5,7,9};
       
      TreeSet<Integer> set = new TreeSet<>(); 
       
      set.addAll(Arrays.asList(array1));
       
      set.addAll(Arrays.asList(array2));
       
      System.out.println(set);
  }
}