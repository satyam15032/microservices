package librarypackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private RestTemplate restTemplate;


}
