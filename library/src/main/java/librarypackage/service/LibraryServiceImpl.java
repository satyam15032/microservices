package librarypackage.service;

import librarypackage.feignclient.BookServiceClient;
import librarypackage.feignclient.UserServiceClient;
import librarypackage.model.Book;
import librarypackage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
    BookServiceClient bookServiceClient;

    @Autowired
    UserServiceClient userServiceClient;

    @Override
    public List<Book> getAllBooks() {
        return bookServiceClient.getAllBooks();
    }

    @Override
    public Book addBook(Book book) {
        return bookServiceClient.addBook(book);
    }

    @Override
    public Book getBookById(Long bookId) {
        return bookServiceClient.getBookById(bookId);
    }

    @Override
    public Book updateBook(Long bookId, Book bookDetails) {
        return bookServiceClient.updateBook(bookId,bookDetails);
    }

    @Override
    public ResponseEntity<?> deleteBook(Long bookId) {
        return bookServiceClient.deleteBook(bookId);
    }

    @Override
    public List<User> getAllUsers() {
        return userServiceClient.getAllUsers();
    }

    @Override
    public User getUserById(Long userId) {
        return userServiceClient.getUserById(userId);
    }

    @Override
    public User addUser(User user) {
        return userServiceClient.addUser(user);
    }

    @Override
    public User updateUser(Long userId, User userDetails) {
        return userServiceClient.updateUser(userId,userDetails);
    }

    @Override
    public ResponseEntity<?> deleteUser(Long userId) {
        return userServiceClient.deleteUser(userId);
    }


}
