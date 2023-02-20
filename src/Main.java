import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookList;
        bookList = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookname().compareTo(o2.getBookname());
            }
        });
        bookList.add(new Book("Nutuk","Atatürk",1923,85));
        bookList.add(new Book("1981","George Orwell",1981,180));
        bookList.add(new Book("Gelin","Sena doğan",1998,552));
        bookList.add(new Book("Evet","Jim Carry",2002,45));
        bookList.add(new Book("Adnan","CEHP",1997,456));
        bookList.add(new Book("Azail","ilkay",2003,777));
        for (Book book:bookList) {
            System.out.println(book.getBookname());
        }
        TreeSet<Book> bookList2;
        bookList2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        }.reversed());
        bookList2.add(new Book("Nutuk","Atatürk",1923,85));
        bookList2.add(new Book("1981","George Orwell",1981,180));
        bookList2.add(new Book("Gelin","Sena doğan",1998,552));
        bookList2.add(new Book("Evet","Jim Carry",2002,45));
        bookList2.add(new Book("Adnan","CEHP",1997,456));
        bookList2.add(new Book("Azail","ilkay",2003,777));
        System.out.println("New------------------------");
        for (Book book:bookList2) {
            System.out.println(book.getBookname());
        }

    }
}