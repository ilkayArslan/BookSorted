import java.util.Comparator;

public class Book implements Comparator<Book>{
    private String bookname;
    private String author;
    private int date;
    private int pageNumber;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Book(String bookname, String author, int date, int pageNumber) {
        this.bookname = bookname;
        this.author = author;
        this.date = date;
        this.pageNumber=pageNumber;

    }


    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return 0;
    }
}

