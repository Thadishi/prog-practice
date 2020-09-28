package hackerrank.daysofcode;

public class day12 {

    private String title;
    private String author;

    public day12(String title, String author){
        this.title = title;
        this.author = author;
    }

    
    class MyBook extends day12{
        
        private int price;

        public MyBook(String bookTitle, String bookAuthor, int price){
            super(bookTitle, bookAuthor);
            this.price = price;
        }

        void display(){
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
        }

    }
}
