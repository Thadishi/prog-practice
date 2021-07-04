package puzzles;
import java.util.Arrays;

/**
 * determine if 2 arrays are equal.
 * they have to have the same length
 * same values a the same indices.
 */
public class puzzleD20 {
    
    public static boolean equal(int[] arr1, int[] arr2){

        boolean areThey = false;

        if(arr1.length != arr2.length){
            areThey = false;}
        else{
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    areThey = false;
                    return areThey;
                }
            }
            areThey = true;
            return areThey;
        }
        
        return areThey;
    }

    public static void main(String[] args){

        int[] thisarr1 = {0,1,2,3,4,5,6,7,8};
        int[] thisarr2 = {0,1,2,3,4,5,6,7,8};

        System.out.println(equal(thisarr1, thisarr2));

    }
}
