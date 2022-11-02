import java.util.Arrays;

public class Reader {
    private String name;
    private int readers_ticket;
    private String faculty;
    private String phone_number;
    private String date_birth;

    public Reader(String name, String faculty, String phone_number, String date_birth){
        this.name = name;
        this.faculty = faculty;
        this.phone_number = phone_number;
        this.date_birth = date_birth;
        this.readers_ticket = (int) (Math.random() * 10000);
    }

    public String takeBook(int amount){
        return String.format("%s книг взял в количестве: %s.", name, amount);
    }

    public String takeBook(String... book){
        return String.format("%s книг взял в количестве: %s. " +
                "Названия книг: %s.", name, book.length, Arrays.toString(book));
    }

    public String takeBook(Book... book){
        return String.format("%s книг взял в количестве %s. " +
                "Названия книг: %s. ", name, book.length, Arrays.toString(book));
    }

    public String returnBook(int amount){
        return String.format("%s книг вернул в количестве: %s.", name, amount);
    }

    public String returnBook(String... book){
        return String.format("%s книг вернул в количестве: %s. " +
                "Названия книг: %s.", name, book.length, Arrays.toString(book));
    }

    public String returnBook(Book... book){
        return String.format("%s книг вернул в количестве %s. " +
                "Названия книг: %s", name, book.length, Arrays.toString(book));
    }

    public String toString(){
        return String.format("Имя: %s, факультет: %s, номер чит.билета: %s, номер телефона: %s, дата рождения: %s.", name, faculty, readers_ticket, phone_number, date_birth);
    }
}
