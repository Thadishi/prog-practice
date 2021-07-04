
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java8test{

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,6,6,6,666);

        System.out.println("declarative");

        for(Integer number : numbers){
            System.out.println(number);}

        
        System.out.println("aggregate operations");

        numbers.forEach(number -> System.out.println(number));

        System.out.println(" method reference operator");

        numbers.forEach(System.out::println);

        System.out.println("streams");
        int total = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(total);

    }
}