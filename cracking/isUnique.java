package cracking;
import java.util.Arrays;

public class isUnique {

    public static Boolean unique(String somestring){

        String lowercase = somestring.toLowerCase();

        char[] characters = lowercase.toCharArray();
        System.out.println(Arrays.toString(characters));
        Arrays.sort(characters);
        //Boolean isItUnique = true;
        System.out.println(Arrays.toString(characters));

        for(int i=0; i<characters.length-1; i++){
            if(characters[i] == characters[i+1]){
                return false;}
        }
        
        
        return true;

        //return isItUnique;
    }

    public static void main(String[] args){

        String jude = "StAaAoAoAaAan";

        System.out.println(unique(jude));
    }
    
}
