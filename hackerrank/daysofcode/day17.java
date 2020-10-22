package hackerrank.daysofcode;

public class day17 {
    

    public static int power(int n, int p){
        int number;
        //try{
        if( n < 0){
            throw new ArithmeticException("n and p should be non-negative");
        }
        else if(p < 0){
            throw new ArithmeticException("n and p should be non-negative");
        }

        else{
            number = (int)Math.pow(n,p);
        }
       /* }catch(Exception e){
            e.getMessage();
            System.out.println("n and p should be non-negative");

        }*/

        return number;
    }

    public static void main(String[] args){


        System.out.println(power(-3, 5));


    }
}
