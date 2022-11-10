package mk.finki.ukim.mk.lab1nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
public class Lab1NovaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab1NovaApplication.class, args);
    }

}
