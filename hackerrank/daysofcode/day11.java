package hackerrank.daysofcode;

public class day11 {

    public static int hourglass(){
        int[][] hour = {{1,1,1,0,0,0}, {0,1,0,0,0,0}, {1,1,1,0,0,0},
    {0,0,0,0,0,0},{0,0,0,0,0,0}, {0,0,0,0,0,0}};

    /*int j=0, i=0;
    int count =0;

    for(i=0; i<hour.length; i++){
        for(j=0; j<hour[i].length; j++){
            if(count%6==0)
                System.out.println();
            System.out.printf("%d", hour[i][j]);
            count++;
        }
    }*/
    int k=0;
    int m=0;
    int rowstart, rowend=3, colstart, colend=3;

    while(colend < 6 && rowend <6){
        for(rowstart=k; rowstart<rowend; rowstart++){
            System.out.println(rowend);
            m=0;
            for(colstart=m; colstart<colend; colstart++){
                System.out.println(hour[rowstart][colstart] + " ["+rowstart+","+colstart+"]");
            }
            m++;
        }
        System.out.println("difference="+(colend-k));
        k++;
        rowend++;
        colend++;
        
    }
    return 0;
    
    }

    public static void main(String[] args){
        hourglass();
    }
    
}