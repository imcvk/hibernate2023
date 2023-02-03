package mainapp;

import dao.ObjectDAO;
import dummydata.DummyUserProvider;
import model.Book;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
  public static void main(String[] args) {
    DummyUserProvider provider = new DummyUserProvider();
    Book book = new Book();
    book.setTitle("sdfsdf");
    book.setContent("sdfsdf");
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();
    book.setPublishedTimestamp(localDateTime);
    book.setLastUpdateDate(localDate);
    book.setLastUpdateTime(localTime);
    ObjectDAO.saveObject(book);

  }
}
