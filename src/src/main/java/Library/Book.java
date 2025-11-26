package java.Library;

public class Book {
    private String title;
    private Author[] author;
    private int NrOfAuthors;
    /*public Book(Author[] author, String title){
    this.title = title;
    NrOfAuthors = author.length;
    this.author = new Author[NrOfAuthors];
    for (int i = 0; i < NrOfAuthors; i++) {
        this.author[i]= author[i];
    }
    }*/
    public Book(String title){
        this.title = title;
    }

    public void addAuthor(Author author){
        if(this.author == null){
            this.author = new Author[1];
        }
        this.author[NrOfAuthors++] = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthor() {
        return author;
    }
    public void setAuthor(Author[] author) {
        this.author = author;
    }
    public int getNrOfAuthors() {
        return NrOfAuthors;
    }
    public void setNrOfAuthors(int NrOfAuthors) {
        this.NrOfAuthors = NrOfAuthors;
    }
    public void print(){
        System.out.println("Title: " + title);
        System.out.println("Author(s): ");
        for (int i = 0; i < NrOfAuthors; i++) {
            author[i].print();
        }
    }
    public void addContent(Element content){
        if(content instanceof Section){
            Section section = (Section) content;
        }
        else if(content instanceof Book){

        }
    }
}
