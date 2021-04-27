package forloop;


public class Test {


    public static void main(String[] args)
    {
        
        int arr[]= {1,1,1,2,2,2,3,4,5,5,5,6};
        int res[]=duplicate(arr);
        for(int i=0;i<res.length;i++)
            System.out.print(arr[i]+ " ");
    }


    private static int[] duplicate(int[] arr) 
    {
        int j=0, i;
        
        for(i=0;i<arr.length; i++)
        {
            if(arr[j]!=arr[i])
            {
                j++;
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]= tmp;
            }
            
        }
        System.out.println("till index j element are unique ");
        for(i=j+1;i<arr.length;i++)
            arr[i]= -1;
        
        return arr;
    }
}
 
