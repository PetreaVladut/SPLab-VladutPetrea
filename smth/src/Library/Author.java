package Library;

public class Author {
    private String author;
    public Author(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void print(){
        System.out.println("Author(s): " + author);
    }
}
