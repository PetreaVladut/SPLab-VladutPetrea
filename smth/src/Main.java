import Library.*;

public static void main(String[] args) {
    Book book = new Book("Titlu");
    book.addAuthor(new Author("Julian von Populi"));
    //System.out.print(book.getNrOfAuthors());
    book.print();
    Section cap1 = new Section("Capitolul 1");
    Paragraph p1 = new Paragraph("Paragraph 1");
    cap1.add(p1);
    Paragraph p2 = new Paragraph("Paragraph 2");
    cap1.add(p2);
    Paragraph p3 = new Paragraph("Paragraph 3");
    cap1.add(p3);
    Paragraph p4 = new Paragraph("Paragraph 4");
    cap1.add(p4);
}
