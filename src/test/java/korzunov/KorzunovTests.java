package korzunov;

import allclasses.korzunov.KorzunovClass;
import org.junit.Test;
import static org.junit.Assert.*;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import io.qameta.allure.Issue;

public class KorzunovTests {

    @Test
    @DisplayName("Тест на создание книги")
    @Description("Тест проверяет создание книги с заданными параметрами")
    @Step("Создание книги с названием {0}, автором {1} и количеством страниц {2}")
    @TmsLink("TMS-123")
    @Issue("ISSUE-456")
    public void testBookCreation() {
        KorzunovClass book = new KorzunovClass("Мастер и Маргарита", "Михаил Булгаков", 448);

        String expectedInfo = "Книга: Мастер и Маргарита\n" +
                "Автор: Михаил Булгаков\n" +
                "Количество страниц: 448\n" +
                "Доступна: да";

        assertEquals(expectedInfo, book.getBookInfo());
    }

    @Test
    @DisplayName("Тест на изменение доступности книги")
    @Description("Тест проверяет изменение доступности книги")
    @Step("Изменение доступности книги {0}")
    @TmsLink("TMS-124")
    @Issue("ISSUE-457")
    public void testAvailabilityChange() {
        KorzunovClass book = new KorzunovClass("Преступление и наказание", "Фёдор Достоевский", 672);

        assertTrue(book.getBookInfo().contains("Доступна: да"));

        book.setAvailability(false);

        assertTrue(book.getBookInfo().contains("Доступна: нет"));
    }

    @Test
    @DisplayName("Тест на изменение количества страниц")
    @Description("Тест проверяет изменение количества страниц книги")
    @Step("Изменение количества страниц книги {0}")
    @TmsLink("TMS-125")
    @Issue("ISSUE-458")
    public void testZeroPageCount() {
        KorzunovClass book = new KorzunovClass("Тестовая книга", "Тестовый автор", 0);

        assertTrue(book.getBookInfo().contains("Количество страниц: 0"));
    }

    @Test
    @DisplayName("Тест на пустое название и автора")
    @Description("Тест проверяет создание книги с пустым названием и автором")
    @Step("Создание книги с пустым названием и автором")
    @TmsLink("TMS-126")
    @Issue("ISSUE-459")
    public void testEmptyTitleAndAuthor() {
        KorzunovClass book = new KorzunovClass("", "", 100);

        String expectedInfo = "Книга: \n" +
                "Автор: \n" +
                "Количество страниц: 100\n" +
                "Доступна: да";

        assertEquals(expectedInfo, book.getBookInfo());
    }
}
