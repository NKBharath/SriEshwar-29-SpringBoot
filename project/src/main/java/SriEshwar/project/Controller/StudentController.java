package SriEshwar.project.Controller;

import SriEshwar.project.Models.Student;
import SriEshwar.project.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentServices studentServices;

    @GetMapping("/getall")
    ResponseEntity <List<Student>> getall(){
        return new ResponseEntity<>(studentServices.getallstudent(), HttpStatus.OK);
    }
    @PutMapping("/update")
    ResponseEntity <Student> updatestudent(@RequestBody Student data){
        return new ResponseEntity<>(studentServices.updatestudent(data), HttpStatus.ACCEPTED);
    }


    //path variable
    @GetMapping("getbyid/{id}")
    ResponseEntity<?> getbyId(@PathVariable long id){
        try{
            Student response = studentServices.getbyid(id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (RuntimeException exception){
            return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
        }
    }


    //req body
    @PostMapping("/create")
    ResponseEntity<Student> createtodo(@RequestBody Student body){
       return new ResponseEntity<>(studentServices.createstudent(body), HttpStatus.CREATED);
    }
    //request param
    @GetMapping
    String getbyIdParam(@RequestParam long i){
        return "todo with id " + i;
    }
}
