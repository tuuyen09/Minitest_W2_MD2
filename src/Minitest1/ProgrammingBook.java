package Minitest1;

public class ProgrammingBook extends Book{
    private String language;
    private String frameWork;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String frameWork) {
        this.language = language;
        this.frameWork = frameWork;
    }

    public ProgrammingBook(int bookCode, String name, double price, String author) {
        super(bookCode, name, price, author);
    }

}
