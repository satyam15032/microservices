package bookpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class BookMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookMainApplication.class,args);
    }
}

