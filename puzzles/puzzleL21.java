package puzzles;

public class puzzleL21 {

    public static void middleSquare(){
        int row, col;
        int starcount =0;

        for(row=0; row<=11; row++){
            for(col=0; col<=3; col++)
                System.out.printf(".");
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println(" this is going ot be hard");

        middleSquare();
    }
    
}