package Library;

import java.util.Arrays;

public class Book {
    private String title;
    private String[] author;
    private int NrOfAuthors;
    public Book(Author[] author, String title){
    this.title = title;
    NrOfAuthors = author.length;
    this.author = new String[NrOfAuthors];
    for (int i = 0; i < NrOfAuthors; i++) {
        this.author[i]= String.valueOf(author[i]);
    }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthor() {
        return author;
    }
    public void setAuthor(String[] author) {
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
        System.out.println("Author(s): " + Arrays.toString(author));
    }
}
