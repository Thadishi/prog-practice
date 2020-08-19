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
        int count = 0;
        int position = 0;
        char[] arr = base2.toCharArray();

        //For every 1 in the array, count 1
        //for every 0, test for max of consecutive 1s
        while(position <arr.length){
            if(arr[position]=='1')
                count++;
            else if(arr[position]=='0'){
                maxcount = (maxcount > count) ? maxcount : count;
                count = 0;
            }

            position++;
        }

        //when your next array is not 0 make sure that max count is max count
        maxcount = (maxcount > count) ? maxcount : count;

        return maxcount;
    }

    public static void main(String[] args){

        System.out.println("reverse is:  ");

        System.out.println(reverseAstring(baseTenToTwo(192381, "")));

        System.out.println("max count");

        System.out.println(maxConsOnes(reverseAstring(baseTenToTwo(192381, ""))));

        
    }
    
}