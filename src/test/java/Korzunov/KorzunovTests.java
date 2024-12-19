package Korzunov;

import allclasses.korzunov.KorzunovClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KorzunovTests {
    @Test
    public void testBookCreation() {
        KorzunovClass book = new KorzunovClass("Мастер и Маргарита", "Михаил Булгаков", 448);

        String expectedInfo = "Книга: Мастер и Маргарита\n" +
                "Автор: Михаил Булгаков\n" +
                "Количество страниц: 448\n" +
                "Доступна: да";

        assertEquals(expectedInfo, book.getBookInfo());
    }

    @Test
    public void testAvailabilityChange() {
        KorzunovClass book = new KorzunovClass("Преступление и наказание", "Фёдор Достоевский", 672);

        assertTrue(book.getBookInfo().contains("Доступна: да"));

        book.setAvailability(false);

        assertTrue(book.getBookInfo().contains("Доступна: нет"));
    }

    @Test
    public void testZeroPageCount() {
        KorzunovClass book = new KorzunovClass("Тестовая книга", "Тестовый автор", 0);

        assertTrue(book.getBookInfo().contains("Количество страниц: 0"));
    }

    @Test
    public void testEmptyTitleAndAuthor() {
        KorzunovClass book = new KorzunovClass("", "", 100);

        String expectedInfo = "Книга: \n" +
                "Автор: \n" +
                "Количество страниц: 100\n" +
                "Доступна: да";

        assertEquals(expectedInfo, book.getBookInfo());
    }
}
