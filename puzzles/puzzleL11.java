package puzzles;

public class puzzleL11 {

    public static int oddfive(int number){
        
        for(int i=1; i<number; i+=2){
            System.out.printf("%3d",i);
            if(i%5==4) System.out.print("\n");

        }


        return 0;
    }
    public static void main(String[] args){

        System.out.println(oddfive(54));

    }
    
}