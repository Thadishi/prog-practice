package puzzles;

public class puzzleL11 {

    /**
     * this method prints 5 numbers per line
     * starting from number 1, yes
     * @param number
     * @return
     */
    public static int oddfive(int number){
        int count =0;
        
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
     * the solution is to have a counter, then a new line everytime tha counter 
     * is found to be tru for a certain boolean
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

    /**
     * This method print 5 items per line.
     * You must exclude multiples of 5 and 3.
     * To achieve this, a counter will count how many numbers per line there are
     * then print as stated.
     * @return int
     */
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

    /**
     * This is straighfoward
     * You print stars.
     * To achieve this, two loops are employed
     * @return
     */
    public static int stars(){

        int row, col;
        int n=7, m = 21;

        for(row=0; row<n; row++){
            for(col=0; col<m; col++)
                System.out.printf("*");
            System.out.printf("\n");
        }
        

        
        return 0;
    }

    /**
     * You have to print a right angled triangle with stars at end
     * and dots in between
     * 
     * This is tricky.
     * The second loop relies on the first loop to determine how many dots to print
     * 
     */
    public static void starRight(){

        for(int line=0; line<15; line++){
            for(int col=0; col<line; col++){
                System.out.printf(".");
            //System.out.printf("*");
            }
            System.out.println("*");
        }
    }

    /**
     * this is similar to the one above.
     * where the stars are flipped.
     */
    public static void starRightFlipped(){

        for(int line=15; line>=0; line--){
            for(int col=0; col<line; col++)
                System.out.printf(".");
            System.out.println("*");
        }
        
    }

    public static void starRightMirror(){
        int row, col;
        for( row=0; row<15; row++){
            for( col=0; col<row; col++)
                System.out.print(" ");
            for(int j=15; j>=row; j--)
                System.out.printf("*");
            System.out.println();
        }
    }

    public static void alternative(){
        int row, col;
        
        for(row=0; row<=15; row++){
            for(col=0; col<row; col++)
                System.out.printf(" ");
            for(; col<15; col++)
                System.out.printf("*");
            System.out.println();
        }
    }

    public static void triangleTree(){
        int line, col, jane;
        for( line=15; line>=0; line--){
            for( col=0; col<line; col++)
                System.out.printf(".");
            for(; col<=15; col++)
                System.out.printf("*");
            for(; col<=30; col++)
                System.out.printf("-");
            
            System.out.println();
        }
    }

    public static void treeTriangle(){
        int row, col, jane;
        for(row=0; row<=15; row++){
            for(col=15; col>=row; col--)
                System.out.printf(".");
            for(; col>=0; col--)
                System.out.printf("*");
            for(col=0; col<=row; col++)
                System.out.print("+");
            for(; col<=15; col++)
                System.out.print(",");
            System.out.println();
        }
    }
    public static void main(String[] args){

        //System.out.println(oddfive(54));

        //System.out.println(oddseven());

        //System.out.println(excludeThreeandFive());

        System.out.println(stars());

        //starRight();

        //starRightFlipped();

        //starRightMirror();

        //alternative();

        //triangleTree();

        treeTriangle();

    }
    
}