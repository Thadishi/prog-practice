import java.lang.*;
public class math{

    public static int mystery(int a, int b){
        if (b==0) return 0;
        if (b%2 ==0) return mystery(a+a, b/2);
        return mystery(a+a, b/2)+a;
    }

    public static int factorial(int number){

        if (number ==0)
            return 1;
        else return number*(factorial(number - 1));
    }

    public static double logg(int n){

        return Math.log(n);
    }

    public static void main(String[] args){

        int judas = Integer.parseInt(args[0]);
        int francis = Integer.parseInt(args[1]);
        int mad = Integer.parseInt(args[2]);

        if (judas == francis && francis == mad)
            System.out.println("equals");
        else
            System.out.println("not equal");


        
        System.out.println("LOG");
        System.out.println(logg(factorial(3)));
    }
}