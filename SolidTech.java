import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.*;

public class SolidTech{

    public static void main(String[] args) {
		/*String items[] = { "fig",  "apple", "date", "banana", "egg", "carrot" };
		System.out.println("Original List: " + Arrays.toString(items));
		
		items = sortItems(items, false);
		System.out.println("Ascending List: " + Arrays.toString(items));
		
		items = sortItems(items, true);
        System.out.println("Descending List: " + Arrays.toString(items));*/
        
        List<Integer> x = findNumbersWithCount(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
		System.out.println(x);
	}
    public static String[] Reverse(String[] judas){
        for(int i = 0; i < judas.length / 2; i++){
    String temp = judas[i];
    judas[i] = judas[judas.length - i - 1];
    judas[judas.length - i - 1] = temp;}
    return judas;
    }
	public static String[] sortItems(String items[], boolean inReverse) {

        // DO SOMETHING TO SORT THE LIST
        Arrays.sort(items);
        String[] asc = items;
        Arrays.sort(items);
        String[] desc = Reverse(asc);
        
        if(inReverse == true)
            return desc;
        else
            Arrays.sort(items);
            return items;
    }
    
    public static int count(String inputString, String wordToCount){

        //Split string
        String[] detailed = inputString.split("\\ ");
        int counting = 0;
        for (int i=0; i<detailed.length; i++){
            if (detailed[i].toLowerCase() == wordToCount.toLowerCase());
                counting++;
        }

        return counting;


    }

    public static List<Integer> findNumbersWithCount(int[] listOfNumbers, int countOfOccurrenceThreshold) 
    {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        
        Arrays.stream(listOfNumbers)
        .collect(Collectors.groupingBy(s -> s))
        .forEach((k, v) -> System.out.println(k+" "+v.size()));

	}
}