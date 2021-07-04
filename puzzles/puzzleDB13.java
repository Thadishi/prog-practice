package puzzles;
import java.util.Arrays;
puublic class puzzleDB13 {

    /**
     * compute the sum of the absolut value of the difference between each array element and its index.
     */

     int sumAbsolute(int[] arr){

        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum += Math.abs(arr[i] - i);
        }

        return sum;
     }
    
}
