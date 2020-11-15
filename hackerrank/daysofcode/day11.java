package hackerrank.daysofcode;

public class day11 {

    public static int hourglass(){
        int[][] hour = {{1,1,1,0,0,0}, {0,1,0,0,0,0}, {1,1,1,0,0,0},
    {0,0,2,4,4,0},{0,0,0,2,0,0}, {0,0,1,2,4,0}};

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
    /*int count =0;
    for(int i=0; i<hour.length; i++){
        for(int j=0; j<hour[i].length; j++){
            System.out.printf( "%2d", hour[i][j]);
            count++;
            if(count%6==0) System.out.println();
        }

    }*/
    int k=0;
    int m=0;
    int rowend=3, colend=3;
    int sum =0;

    int jude =0;
    while(colend < 6 && rowend <6){
        for(int i=k; i<=colend; i++){
            for(int j=m; j<rowend; j++){
                System.out.printf("%2d ", hour[i][j]);
                /*jude++;
                if (jude%3==0) System.out.println();*/
                sum += (hour[i][j]+hour[i][j+1]+hour[i][j+2]+hour[i+1][j+1]+hour[i+2][j]+hour[i+2][j+1]+hour[i+2][j+2]);

            }
            
        }

        colend++;
        rowend++;

    }
    return sum;
    
    }

    public static void main(String[] args){
        hourglass();
    }
    
}