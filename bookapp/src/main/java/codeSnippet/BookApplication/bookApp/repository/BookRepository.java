package codeSnippet.bookApplication.bookApp.repository;

import codeSnippet.bookApplication.bookApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<Book, Integer> {


}
