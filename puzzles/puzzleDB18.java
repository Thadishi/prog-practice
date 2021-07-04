package puzzles;
import java.util.Arrays;

public class puzzleDB18 {

    public static int[] oddToEven(int[] arr){

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 1 && arr[i]%2 !=0){
                arr[i] = arr[i] + (-1);
            }
            else if(arr[i]>1 && arr[i]%2!=0){
                arr[i] = arr[i] +1;
            }
        }

        return arr;
    }

    public static void main(String[] args){

        int thisArray[] = {-12,-11,-10,-9,-8,-7,-6,-5,-4,-3,
        -2,-1,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        

        System.out.println(Arrays.toString(oddToEven(thisArray)));
    }
    
}
