package solitaire;

public class Deck {

    private String Aces;
    private String One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;

    private CARD[] deckOfCards;
    private static final NCARDS = 52;

    public Deck(){
        deckOfCards = new CARD[NCARDS];

    }

    private class Card{

        private char name;
        private char number;

        public Card(char name, char number){
            this.name = name;
            this.number = number;
        }
    }

    public String getAces(){

        return Aces;
    }
    public String getOne(){
        return One;
    }

    public String getTwo(){
        return Two;
    }

    public String getThree(){
        return Three;
    }

    public String getFour(){
        return Four;
    }

    public String getFive(){
        return Five;
    }

    public String getSix(){
        return Six;
    }

    public String getSeven(){
        return Seven;
    }

    public String getEight(){
        return Eight;
    }

    public String getNine(){
        return Nine;
    }

    public String getTen(){
        return Ten;
    }

    public String getJack(){
        return Jack;
    }

    public String getQueen(){
        return Queen;
    }

    public String getKing(){
        return King;
    }
    
}
