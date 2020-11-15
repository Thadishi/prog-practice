public class absolute4P1 {
    private int beer;


    public absolute4P1(int beerN){
        if(beerN <= 0)
            this.beer = 0;
        else if(beerN >=99)
            this.beer = 99;
        else{
            this.beer = beerN;
        }

        
    }

    public void printSong(){
        int beerNumber = beer;

        while(beerNumber >=0){
            if (beerNumber == 0){
                System.out.println(beerNumber+" bottles of beer on the wall,");
            } else{
                System.out.println(beerNumber+" bottles of beer on the wall,");
                System.out.println(beerNumber+" bottles of beer,");
                System.out.println("Take one down, pass it around,");
            }

            beerNumber--;
        }


    }

    public static void main(String[] args){

        absolute4P1 beerSong = new absolute4P1(55);

        beerSong.printSong();
    }
    
}
