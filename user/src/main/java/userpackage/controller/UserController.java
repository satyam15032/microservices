package userpackage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import userpackage.entity.User;
import userpackage.exception.UserNotFoundException;
import userpackage.repository.UserRepository;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User", "id", userId));
    }
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User", "id", userId));

        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable(value = "id") Long userId,
                           @RequestBody User userDetails) {

        userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User", "id", userId));

        userDetails.setId(userId);
        User updateUser = userRepository.save(userDetails);
        return updateUser;
    }
}
