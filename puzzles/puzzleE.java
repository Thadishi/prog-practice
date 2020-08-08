package puzzles;

public class puzzleE {

    public static double mathE20(){

        // X+Y/(2C)

        double x = 12.3, y = 7.2, c = 3.2;

        double result = (x+y)/(2*c);

        System.out.printf("result %f\n", result);

        return 0.0;
    }

    public static double mathE22(){
        //-b + sqrt(b^2 - 4ac)/ 2a

        double a = 1.4, b=4.2, c = -2.4;
        //sqrt(b^2 - 4ac)
        double square = b*b - 4*a*c;

        //check if its a real number
        if(square >=0){
            double result = (-b + Math.sqrt(square))/ 2*a;

            System.out.printf("result: %f\n", result);
        }
        else{
            System.out.printf("There is no real number solution\n");
        }
        return 0.0;
    }

    public static double mathE21(){
        // x^2 + y^2 / (a - b)


        double x = 12.3, y=7.2, a = 10.5, b = 4.3;

        double result = (x*x + y*y)/(a - b);

        System.out.printf("result: %f\n", result);

        return 0.0;
    }

    public static void main(String[] args){

        System.out.printf("%d\n", 5%2);
        //puzzle20
        System.out.println(mathE20());
        //puzzle21
        System.out.println(mathE21());
        //puzzle22
        System.out.println(mathE22());

    }
    
}