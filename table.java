//1.1.21
import java.util.Scanner;

public class table{

    public static String mystery(String s){

        int N = s.length();
        if (N <= 1) return s;

        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);

        return mystery(b) + mystery(a);
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //System.out.printf()

        /*while (!input.equals("Q")){
            

        }*/
        String judas = "judas";
        String half1 = judas.substring(0, judas.length()/2);
        String half2 = judas.substring(judas.length()/2, judas.length());

        System.out.println(mystery("judas"));
        System.out.println(half1 + " "+ half2);

    }
}