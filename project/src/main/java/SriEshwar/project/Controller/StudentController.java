package SriEshwar.project.Controller;

import SriEshwar.project.Models.Student;
import SriEshwar.project.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentServices studentServices;
    @GetMapping("/getall")
    String getall(){
        return "method to get all";
    }
    //path variable
    @GetMapping("getbyid/{id}")
    String getbyId(@PathVariable long id){
        return "todo with id" + id;
    }
    //req body
    @PostMapping("/create")
    Student createtodo(@RequestBody Student body){
       return studentServices.createstudent(body);
    }
    //request param
    @GetMapping
    String getbyIdParam(@RequestParam long i){
        return "todo with id " + i;
    }
}
