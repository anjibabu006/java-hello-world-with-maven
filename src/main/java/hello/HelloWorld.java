package hello;

import org.joda.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Enables this class to handle web browser URLs
public class HelloWorld {

    public static void main(String[] args) {
        // Starts the embedded web server on port 8080

SpringApplication.run

(HelloWorld.class, args);
    }

    @GetMapping("/") // Maps this method to http://localhost:8080/
    public String sayHelloWeb() {
        LocalTime currentTime = new LocalTime();
        Greeter greeter = new Greeter();
        
        // This exact string will appear on your browser screen
        return "The current local time is: " + currentTime + "<br>" + greeter.sayHello();
    }
}
