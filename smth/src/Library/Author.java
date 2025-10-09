package Library;

public class Author {
    private String name;
    private String surname;
    public Author(String name) {
        String[] s = new String[2];
        s = name.split(" ");
        this.name = s[0];
        this.surname = s[1];
    }
    public String getAuthor() {
        return name;
    }
    public void setAuthor(String name) {
        this.name = name;
    }
    public void print(){
        System.out.print(name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
