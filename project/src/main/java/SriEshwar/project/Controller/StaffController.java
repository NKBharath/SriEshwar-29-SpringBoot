package SriEshwar.project.Controller;

import SriEshwar.project.Models.Staff;
import SriEshwar.project.Models.Student;
import SriEshwar.project.Services.StaffServices;
import SriEshwar.project.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    @Autowired
    private StaffServices staffservices;
    //req body
    @PostMapping("/create")
    ResponseEntity<Staff> createstaff(@RequestBody Staff body){
        return new ResponseEntity<>(staffservices.createstaff(body), HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    ResponseEntity <List<Staff>> getall(){
        return new ResponseEntity<>(staffservices.getallstaff(), HttpStatus.OK);
    }
    @PutMapping("/update")
    ResponseEntity <Staff> updatestudent(@RequestBody Staff data){
        return new ResponseEntity<>(staffservices.updatestaff(data), HttpStatus.ACCEPTED);
    }


    //path variable
    @GetMapping("getbyid/{id}")
    ResponseEntity<?> getbyId(@PathVariable long id){
        try{
            Staff response = staffservices.getbyid(id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (RuntimeException exception){
            return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
        }
    }
}
