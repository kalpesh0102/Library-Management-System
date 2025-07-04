public class Book {

    static int TotalNoOfBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        TotalNoOfBooks = 0;
    }
    {
        TotalNoOfBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn, "unknown", "unknown");
    }

    Book(String isbn, String title){
        this(isbn, title, "unknown");
    }

    static int getTotalNoOfBooks(){
        return TotalNoOfBooks;
    }

    void BorrowBook(){
        if(isBorrowed){
            System.out.println( this.title +" is already Borrowed");
        }
        else{
        this.isBorrowed =  true;
        System.out.println("Enjoy " + this.title);
    }
}
   
    void ReturnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope You Enjoyed The Book, Please Leave A Review");
        }
        else{
            System.out.println( this.title+" is already available");
        }
    }
}
public static void main(String[] args) {
                Book GOT = new Book("1", "GOT", "foody");
                Book HP = new Book("2");
                System.out.println(Book.getTotalNoOfBooks());
                GOT.BorrowBook();
                HP.BorrowBook();
                GOT.BorrowBook();
                GOT.ReturnBook();
                GOT.ReturnBook();
        }
