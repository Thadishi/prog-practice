package hackerrank.daysofcode;

import java.math.*;

public class day14 {

    private int maximumDifference;
    private int[] elements;

    public day14(int[] elements){
        this.elements = elements;
    }

    public int computeDifference(){
        int difference = 0;
        maximumDifference = 0;
        int count =0;

        for(int i=0; i<elements.length; i++){
            for(int j=0; j<elements.length; j++){
                difference = Math.abs(elements[i] - elements[j]);

                maximumDifference = (maximumDifference > difference) ? maximumDifference : difference;
            }
        }

        return maximumDifference;
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 5};

        day14 diff = new day14(arr);

        System.out.println(diff.computeDifference());

    }
    
}