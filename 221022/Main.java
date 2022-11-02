public class Main {
    public static void main(String[] args) {
        var reader_1 = new Reader("Иван", "ИТиАБД", "8909267478976", "07-07-2001");
        System.out.println(reader_1);
        System.out.println(reader_1.takeBook(4));
        System.out.println(reader_1.takeBook("Война и мир", "Гарри Поттер"));
        System.out.println(reader_1.takeBook(new Book("Преступление и наказание", "Ф.М.Достоевский ")));
        System.out.println(reader_1.returnBook(new Book("Престпление и наказание", "Ф.М. Достоевский")));
    }
}