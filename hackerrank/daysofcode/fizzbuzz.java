package hackerrank.daysofcode;

public class fizzbuzz {

    public static void fizznumbers(int Num){

        for(int i=1; i<Num; i++){
            if(i%3==0 && i%5 !=0)
                System.out.println(i+" fizz");
            else if(i%5==0 && i%3 !=0)
                System.out.println(i+" buzz");
            else if(i%3==0 && i%5==0)
                System.out.println(i+" fizzbuzz");
        }
    }

    public static void main(String[] args){
        fizznumbers(17);
    }
    
}
