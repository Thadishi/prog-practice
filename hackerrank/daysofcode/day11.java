package hackerrank.daysofcode;
import java.util.Arrays;
import java.util.ArrayList;;
import java.util.List;
public class day11 {

    /**
     * This fucking thing
     * took me longer than it should have honestly
     * like months my g
     * fucking months
     * @param hour
     * @return
     */

    public static int hourglass(int[][] hour){

        //CONVERT ArrayList TO array

        /*int[][] hour = hourg.stream().map(l -> l.stream()
                                                .mapToInt(Integer::intValue)
                                                .toArray()).toArray(int[][]::new);*/

        int sum = 0;
        int max = -1000;


        for(int i=0; i<hour.length-2; i++){
            for(int j=0; j<hour[i].length-2; j++){

                sum+= (hour[i][j]+hour[i][j+1]+hour[i][j+2]+
                hour[i+1][j+1]+
                hour[i+2][j]+hour[i+2][j+1]+hour[i+2][j+2]);

                System.out.println("sum= "+sum);

                max = sum > max ? sum : max;

                sum=0;

                /*System.out.println(hour[i][j]+" "+hour[i][j+1]+" "+hour[i][j+2]+" "+
                hour[i+1][j+1]+" "+
                hour[i+2][j]+" "+hour[i+2][j+1]+" "+hour[i+2][j+2]+"\n");*/
            }
        }
        

        return max;
    
    }

    public static void main(String[] args){
        int[][] hours = {{1,1,1,0,0,0}, {0,1,0,0,0,0}, {1,1,1,0,0,0},
    {0,0,2,4,4,0},{0,0,0,2,0,0}, {0,0,1,2,4,0}};

    int[][] minushours = {{-1,-1,0,-9,-2,-2}, {-2,-1,-6,-8,-2,-5}, {-1,-1,-1,-2,-3,-4},
{-1,-9,-2,-4,-4,-5}, {-7,-3,-3,-2,-9,-9}, {-1,-3,-1,-2,-4,-5}};

    /*int count =0;
    for(int col=0; col<hours.length; col++){
        for(int row=0; row<hours[col].length; row++){
            System.out.printf("%3d", hours[col][row]);
            count++;
        }
        if (count%6==0) System.out.println();
    }
    if (count%6 !=0) System.out.println();*/

    //System.out.println(Arrays.toString(hour));

        System.out.println(hourglass(hours));
    }
    
}