package hackerrank.problemsolving;
import java.util.Arrays;
import java.util.ArrayList;

public class diagonalD {

    public static int diagonalDifference(List<List<Integer>> arr){
        //convert arraylist to array;
        int[][] hour = arr.stream().map(l -> l.stream()
                                                .mapToInt(Integer::intValue)
                                                .toArray()).toArray(int[][]::new);
        



    }

    public static void main(String[] args){

        List<List<Integer>> stuff = new ArrayList<>(4);

        for(int i=0; i<=4; i++){
            graph.add(new ArrayList<>());
        }
    }
    
}
