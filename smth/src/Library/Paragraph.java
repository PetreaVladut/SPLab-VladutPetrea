package Library;

public class Paragraph implements Element {
    public String name;
    public AlignStrategy alignment;
    public String content;
    public Paragraph(String s) {
        name = s;
    }
    public void setAlignStrategy(AlignStrategy alignment) {
        this.alignment = alignment;
    }
}
