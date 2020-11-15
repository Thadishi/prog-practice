package librarycatalogue;

public class Book {

    String title;
    int pagecount;
    int ISBN;
    // whether it is checked out or not;
    boolean isCheckedout;
    int dayCheckedOut = -1;

    public book(String title, int pagecount, int ISBN){
        this.title = title;
        this.pagecount = pagecount;
        this.ISBN = ISBN;

        isCheckedout = false;
    }
    //getters
    public String getTitle(){
        return title;
    }
    public int getPageCount(){
        return pagecount;
    }

    public int getISBN(){
        return ISBN;
    }

    public boolean getIsCheckedOut(){
        return isCheckedout;
    }

    public int getDayCheckedOut(){
        return dayCheckedOut;
    }

    //setters
    public void setIsCheckedOut(boolean newIsCheckedout, int dayCheckedOut){

        this.isCheckedout = newIsCheckedout;
        setDayCheckedOut(dayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }

    
}
