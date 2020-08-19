package puzzles;

public class puzzleL11 {

    public static int oddfive(int number){
        
        for(int i=1; i<number; i+=2){
            System.out.printf("%3d",i);
            if(i%5==4) System.out.print("\n");

        }


        return 0;
    }
    /**
     * This  question is a little tricky.
     * oddfive(int number) functions differently because 
     * we are starting from 0.
     * it breaks down when we start from a specific number.
     * 
     * the solution is to find an independent counter and use that
     * L12
     * @return
     */
    public static int oddseven(){
        int count =0;
        
        for(int i=147; i>=59; i-=2){
            System.out.printf("%5d",i);
            count++;
            if(count%7==0) System.out.println();

            //this works if we are starting from 0
            //if(i%7==6) System.out.println();


            
        }
        //if(count%7!=0) System.out.printf("\n");

        return 0;
    }

    public static int excludeThreeandFive(){

        //count for last line logic
        int count =0;
        //max number
        int n = 100;
        for(int i=1; i<=n;i++){
            if(i%3!=0 && i%5!=0){
                System.out.printf("%5d",i);
                count++;
                
            }
            if (count%10==0) System.out.println(); 
        }
        return 0;
    }

    public static int puzzle14(){

        

        
        return 0;
    }
    public static void main(String[] args){

        //System.out.println(oddfive(54));

        //System.out.println(oddseven());

        System.out.println(excludeThreeandFive());

    }
    
}