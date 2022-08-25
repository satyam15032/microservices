package librarypackage.service;

import librarypackage.model.Book;
import librarypackage.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public interface LibraryService {
    List<Book> getAllBooks();

    public Book addBook(@RequestBody Book book);

    public Book getBookById(@PathVariable(value = "id") Long bookId);


    public Book updateBook(@PathVariable(value = "id") Long bookId,
                           @RequestBody Book bookDetails);


    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId);


    public List<User> getAllUsers() ;


    public User getUserById(@PathVariable(value = "id") Long userId) ;

    public User addUser(@RequestBody User user) ;


    public User updateUser(@PathVariable(value = "id") Long userId,
                           @RequestBody User userDetails) ;

    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId);



}
