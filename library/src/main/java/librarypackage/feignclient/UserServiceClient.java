package librarypackage.feignclient;

import librarypackage.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="user",url="localhost:8082")
public interface UserServiceClient {

    @GetMapping("/api/user")
    public List<User> getAllUsers();

    @GetMapping("/api/user/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) ;

    @PostMapping("/api/user")
    public User addUser(@RequestBody User user) ;

    @DeleteMapping("/api/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId);

    @PutMapping("/api/user/{id}")
    public User updateUser(@PathVariable(value = "id") Long userId,
                           @RequestBody User userDetails) ;
}
