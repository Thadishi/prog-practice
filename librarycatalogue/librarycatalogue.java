package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class librarycatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay =0;
    int lengthOfCheckoutPeriod =7;
    double initialLateFee = 0.5;
    double feePerLateDay = 1.00;
    

    public librarycatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod,
    double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public librarycatalogue(Map<String, Book> collection){
        this.bookCollection = collection;
    }

    //getters

    public int getCurrentDay(){
        return this.currentDay;
    }
    public int getlengthOfCheckoutPeriod(){
        return this.lengthOfCheckoutPeriod;
    }
    public double getInitialLateFee(){
        return this.initialLateFee;
    }
    public int getFeePerLateDay(){
        return this.feePerLateDay;
    }

    public Map<String, Book> getBookCollection(){
        return this.bookCollection;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    //setters
    public void nexDay(){
        currentDay++;
    }
    public void setDay(int day){
        currentDay = day;
    }
    //instance methods
    public void checkOut(String title){
        Book book = getBook(title);
        if(book.getIsCheckedOut()){
            BookAlreadycheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println(title+"  is due on "+(getCurrentDay() + getlengthOfCheckoutPeriod())+" ");
        }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut()+getlengthOfCheckoutPeriod());

        if(daysLate >0){
            System.out.println(" you owe "+(getInitialLateFee()+daysLate*getFeePerLateDay()) "because book is late");
        } else{
            System.out.println("book returned");
        }

        book.setIsCheckedOut(false, -1);

    }
    public void BookAlreadycheckedOut(Book book){
        System.out.println("sorry, "+book.getTitle()+" book is already checkedout");

    }


    public static void main(String[] args){

    }
    
}
