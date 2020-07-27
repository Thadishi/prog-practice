public class powerof {
    
    public static double zero(int number){

        return Math.pow(number, 0);
    }


    public static void main(String[]args){

        int nun = Integer.parseInt(args[0]);

        System.out.println(zero(nun));
    }
}