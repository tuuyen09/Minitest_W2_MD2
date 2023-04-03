package Minitest1;

public class FictionBook extends Book {
    private String cateGory;

    public FictionBook() {
    }

    public FictionBook(String cateGory) {
        this.cateGory = cateGory;
    }

    public FictionBook(int bookCode, String name, double price, String author, String cateGory) {
        super(bookCode, name, price, author);
        this.cateGory = cateGory;
    }

    public String getCateGory() {
        return cateGory;
    }

    public void setCateGory(String cateGory) {
        this.cateGory = cateGory;
    }
}
