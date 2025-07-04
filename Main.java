public class Main {
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
}
