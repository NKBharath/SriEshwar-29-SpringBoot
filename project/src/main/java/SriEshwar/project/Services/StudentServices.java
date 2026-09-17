package SriEshwar.project.Services;


import SriEshwar.project.Models.Student;
import SriEshwar.project.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    private StudentRepository studentrepository;

    public Student createstudent (Student  data){
        Student result =  studentrepository.save(data);
        return result;
    }

    public List<Student> getallstudent (){
        return  studentrepository.findAll();
    }

    public Student updatestudent (Student data){
        return studentrepository.save(data);
    }

    public Student getbyid(Long Id){
            return studentrepository.findById(Id).orElseThrow(()-> new RuntimeException("Todo not found"));
    }
}
