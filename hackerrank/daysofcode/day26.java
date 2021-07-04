package hackerrank.daysofcode;
import java.util.Arrays;
import java.util.Scanner;

public class day26 {
    
    public static int fineOrNo(String returnDates, String dueDates){
        String[] returnD = returnDates.split(" ",5);
        String[] dueD = dueDates.split(" ", 5);
        int fine =0;

        if(Integer.parseInt(returnD[2]) < Integer.parseInt(dueD[2])){
            fine =0;
        }
        else if(Integer.parseInt(returnD[2]) == Integer.parseInt(dueD[2])){
            if(Integer.parseInt(returnD[1]) == Integer.parseInt(dueD[1])){
                if(Integer.parseInt(returnD[0]) <= Integer.parseInt(dueD[0])){
                    fine = 0;
                }
                else{
                    int amount1 = Integer.parseInt(returnD[0]) - Integer.parseInt(dueD[0]);
                    fine = 15*amount1;
                }
            }
            else if(Integer.parseInt(returnD[1]) > Integer.parseInt(dueD[1])){
                int amount2 = Integer.parseInt(returnD[1]) - Integer.parseInt(dueD[1]);
                fine = 500*amount2;
            }
        }
        else{
            fine = 10000;
        }

        return fine;

        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        
        String returned = read.nextLine();
        String dueDate = read.nextLine();

        System.out.println(fineOrNo(returned, dueDate));
    }
}
