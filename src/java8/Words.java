package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Words {


    public static void main(String[] args) throws InterruptedException {

        String [] words = {"Abc","def","asd","rter","cdas","fdsa","gaf","afd","dFAS","ADFAS"};

        int max =3;
        IntStream.range(0, (words.length + max - 1) / max)
                .mapToObj(i -> Arrays.asList(words).subList(i * max, Math.min(max * (i + 1), words.length)))
                .forEach(System.out::println);
        
        
        List<String> asList = Arrays.asList(words);
        
        List<String> collect = asList.stream().limit(3).collect(Collectors.toList());
        collect.forEach(System.out::print);
    
    }

}
