package solitaire;

public class main {

    public static void main(String[] args){

        Deck clubs = new Deck("AC", "1C", "2C","3C","4C","5C","6C",
        "7C","8C", "9C", "10C", "JC", "QC", "KC");
        Deck Spades = new Deck("AS","1S", "2S", "3S", "4S", "5S", "6S", "7S",
        "8S", "9S", "10S", "JS", "QS", "KS");
        Deck Hearts = new Deck("AH", "1H","2", "3H", "4H", "5H", "6H", "7H", "8H", "9H",
        "10H", "JH", "QH", "KH");
        Deck Diamonds = new Deck("AD", "1D", "2D", "3D", "4D", "5D", "6D", "7D", "8D",
        "9D", "10D", "JD", "QD", "KD");

        System.out.println(clubs.getAces());
    }
    
}
