package codeSnippet.bookApplication.bookApp.controller;

import codeSnippet.bookApplication.bookApp.entity.Book;
import codeSnippet.bookApplication.bookApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/v1")
public class BookController {


    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping("/addBook/")
    @GetMapping("/getbook")
    public ResponseEntity<Book> addBook(@RequestBody Book book)
    {
       Book savedBook=  bookService.addBook(book);
        System.out.println(savedBook.toString());
    return ResponseEntity.ok(savedBook);
    }



}
