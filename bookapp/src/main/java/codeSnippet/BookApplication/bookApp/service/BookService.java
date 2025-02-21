package codeSnippet.bookApplication.bookApp.service;

import codeSnippet.bookApplication.bookApp.entity.Book;
import codeSnippet.bookApplication.bookApp.repository.Bookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.BootstrapRegistry;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    Bookrepository bookrepository;
    public Book addBook(Book book)
    {
      return  bookrepository.save(book);
    }


}
