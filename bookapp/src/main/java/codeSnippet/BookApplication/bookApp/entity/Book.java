package codeSnippet.bookApplication.bookApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data// this annotation will generate the getters and setters
@NoArgsConstructor// this will generate the no args constructor
@AllArgsConstructor// this will generate the all args constructor
public class Book {
    public Book(String author, String genre, Integer id, String name) {
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String name;
    private String  author;
    private String genre;

}
