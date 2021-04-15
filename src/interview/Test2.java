package interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

 

public class Test2 {

 

    public static void main(String[] args)
    {
        List<Integer>lObj= new ArrayList<Integer>(
            Arrays.asList(10, -20, 20, -20, 20, 30, 30, -30, -40, -50, -60, 70, 90)
            );
        
        int key= 20;
        OptionalInt res= lObj.stream().mapToInt(x-> Math.abs(x)).filter(x->x==key).findFirst();
        System.out.println(res);
    }
}

//public int[] sumAndCost(Integer[] arr) {
//    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(arr));
//    int sum = priorityQueue.poll();
//    int cost = 0;
//    while (!priorityQueue.isEmpty()) {
//        int currentElement = priorityQueue.poll();
//        if (currentElement < sum) {
//            priorityQueue.add(sum);
//            sum = currentElement;
//        } else {
//            sum += currentElement;
//            cost += sum;
//            continue;
//        }
//        sum += priorityQueue.poll();
//        cost += sum;
//    }
//    return new int[] {sum, cost};
//}