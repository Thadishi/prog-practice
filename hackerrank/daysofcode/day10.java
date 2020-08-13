package hackerrank.daysofcode;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class day10 {

    //base10 to base2
    //I don'tknow how fasd this is.
    //this converts from base 10 to base 2.
    public static String baseTenToTwo(int decimal, String jude){
        if(decimal ==0) return "";

        //the magic begins
        int num = decimal%2;
        //System.out.println("decimals: "+num);
        String code = jude + String.valueOf(num);
        //System.out.println("this is what it looks like: "+code);
        String ike ="";

        return ike+=String.valueOf((decimal%2)) +baseTenToTwo((int)(Math.floor(decimal/2)), code);
    }

    public static String reverseAstring(String item){
        char itemArr[] = item.toCharArray();
        
        for (int i=0; i<itemArr.length/2; i++){
            char temp = itemArr[i];
            itemArr[i] = itemArr[itemArr.length - i - 1];
            itemArr[itemArr.length - i - 1] = temp;
        }
        String jude = new String(itemArr);

        return jude;
    }

    //maximum number of consecutive 1s
    public static int maxConsOnes(String base2){
        int maxcount =1;
        int position = 0;
        char[] base22 = base2.toCharArray();
        HashMap<Character, Integer> counting = new HashMap<>();

        char current = base22[position];
        while(position < base22.length -1){
            position++;

            if(base22[position] == current){
                maxcount++;
            }
            else{
                counting.put(current, maxcount);
                maxcount = 1;
                current = base22[position];
            }
        }
        counting.put(current, maxcount);
        /*for(int i=0; i<base22.length-1; i++){
            if(base22[i] == '1' && base22[i] == base22[i+1]){
                maxcount++;
            }
        }*/
        System.out.println("collisions?");
        for(char key : counting.keySet()){
            System.out.println("here is: "+key+"-"+counting.get(key));
        }
        //System.out.println(counting.keySet());

        return maxcount;
    }

    public static void main(String[] args){

        System.out.println("reverse is:  ");

        System.out.println(reverseAstring(baseTenToTwo(7411, "")));

        System.out.println("max count");

        System.out.println(maxConsOnes(reverseAstring(baseTenToTwo(23, ""))));

        
    }
    
}