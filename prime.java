public class prime {
    
    public static boolean isPrime(int number){
        if(number <= 2)
            return true;
        else{
            int count = 2;
            while (count < number){
                if(number%count == 0)
                    return false;
                count++;
            }
            return true;
        }
    }

    public static boolean isRelativePrime(int num1, int num2){
        if(num1 == num2)
            return false;
        if(num1 % num2 ==0)
            return false;
        else{
            if(isPrime(num1) && isPrime(num2))
                return true;
            return false;
        }
    }
    public static void main(String[] args){

        int nun = Integer.parseInt(args[0]);

        System.out.println(isPrime(nun));

        System.out.println(isRelativePrime(nun, 7));
    }
}