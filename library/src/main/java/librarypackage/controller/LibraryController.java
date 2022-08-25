package librarypackage.controller;


import librarypackage.model.Book;
import librarypackage.model.User;
import librarypackage.service.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryServiceImpl libraryService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return libraryService.getAllBooks();
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        return libraryService.addBook(book);
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable(value = "id") Long bookId) {
        return libraryService.getBookById(bookId);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable(value = "id") Long bookId,
                           @RequestBody Book bookDetails) {
        return libraryService.updateBook(bookId,bookDetails);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId) {
        return libraryService.deleteBook(bookId);
    }
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return libraryService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return libraryService.getUserById(userId);
    }
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return libraryService.addUser(user);
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {

        return libraryService.deleteUser(userId);
    }
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable(value = "id") Long userId,
                           @RequestBody User userDetails) {

        return libraryService.updateUser(userId,userDetails);
    }


}
