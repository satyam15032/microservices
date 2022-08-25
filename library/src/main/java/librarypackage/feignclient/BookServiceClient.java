package librarypackage.feignclient;

import librarypackage.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="book",url="localhost:8083")
public interface BookServiceClient {

    @GetMapping("/api/book")
    List<Book> getAllBooks();

    @PostMapping("/api/book")
    public Book addBook(@RequestBody Book book) ;

    @GetMapping("/api/book/{id}")
    public Book getBookById(@PathVariable(value = "id") Long bookId) ;

    @PutMapping("/api/book/{id}")
    public Book updateBook(@PathVariable(value = "id") Long bookId,
                           @RequestBody Book bookDetails) ;

    @DeleteMapping("/api/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId) ;
}
