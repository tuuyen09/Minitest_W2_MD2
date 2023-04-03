package Minitest1;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook(1, "A", 100, "A");
        books[1] = new ProgrammingBook(2, "B", 83, "A");
        books[2] = new ProgrammingBook(3, "C", 75, "B");
        books[3] = new ProgrammingBook(4, "D", 600, "C");
        books[4] = new ProgrammingBook(5, "E", 105, "C");
        books[5] = new FictionBook(6, "G", 172, "D", "Viễn tưởng 1");
        books[6] = new FictionBook(7, "H", 70, "I", "Khoa học");
        books[7] = new FictionBook(8, "I", 80, "I", "Tâm lý");
        books[8] = new FictionBook(9, "K", 130, "K", "Kinh dị");
        books[9] = new FictionBook(10, "G", 98, "G", "Viễn tưởng 1");
        int total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        System.out.println("Tổng số tiền = " + total);
        int x = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getCateGory().equals("Viễn tưởng 1"))
                    x++;
            }
        }
        System.out.println("Số sách thể loại 'Viễn tưởng 1': " + x);

        int y = 0;
        for (Book book : books) {
            if (book.getPrice() < 100)
                y++;
        }
        System.out.println("Số sách có giá nhỏ hơn 100: " + y);
    }
}
