package allclasses.korzunov;

public class KorzunovClass {
    private String title;
    private String author;
    private int pageCount;
    private boolean isAvailable;

    public KorzunovClass(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isAvailable = true;
    }

    // получение информации о книге
    public String getBookInfo() {
        return "Книга: " + title +
                "\nАвтор: " + author +
                "\nКоличество страниц: " + pageCount +
                "\nДоступна: " + (isAvailable ? "да" : "нет");
    }

    // изменение статуса доступности книги
    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }
}
