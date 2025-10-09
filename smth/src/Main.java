import Library.Author;
import Library.Book;

public static void main(String[] args) {
    Book book = new Book("Titlu");
    book.addAuthor(new Author("Julian von Populi"));
    //System.out.print(book.getNrOfAuthors());
    book.print();
}
