package puzzles;
import java.util.Arrays;

public class puzzleDC22 {

    public static int maxTwoIndices(int[] Arr, int low, int high){


        return 2;


    }

    /**
     * Look through an array for a place where value x is immediately followed by value y
     * @param arr
     * @param x
     * @param y
     * @return
     */
    public static int findXandY(int[] arr, int x, int y){

        int ItemReturn;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==x && arr[i+1]==y){
                ItemReturn = i;
                return ItemReturn;
            }
        }
        ItemReturn = -1;
        return ItemReturn;

    }

    public static void main(String[] args){

        int[] arrTest = {-5, -3, 0, 6, 4, 16, -3, 0, 7, 9};

        int xFound = findXandY(arrTest, 6, 4);

        if(xFound != -1){
            System.out.println("6 and 4 found at index "+xFound);
        }else{
            System.out.println("Sequence not found");
        }
    }



    
}
