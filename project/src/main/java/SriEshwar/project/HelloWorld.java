package SriEshwar.project;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    String HelloWorld(){
        return "Hello world";
    }
    @GetMapping("/thanks")
    String Thankoyu(){
        return "Thanks";
    }


}
