package librarypackage.model;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;

@Data
public class User {

    private Long id;
    private String userName;
}
