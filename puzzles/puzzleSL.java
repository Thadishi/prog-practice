package puzzles;

public class puzzleSL {
//problem
/**
 * Print integers from 0 to 24, five per line
 */

    public static void main(String[] args){
        for (int i=0; i<=24; i++){
            System.out.printf("%3d ",i);
            if(i%5==4) System.out.printf("\n");

        }
    }

    //Answer
    /**
     * The proble is to print "\n" after every group of 5 integers. So, determien which integers end each group.
     * These are 4,9,14,19 and 24. all yield a remainder of 4 when divided by 5.
     */
    
}