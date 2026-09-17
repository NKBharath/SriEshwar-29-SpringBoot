package SriEshwar.project.Services;


import SriEshwar.project.Models.Staff;
import SriEshwar.project.Models.Student;
import SriEshwar.project.Respository.StaffRepository;
import SriEshwar.project.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServices {
    @Autowired
    private StaffRepository staffrepository;

    public Staff createstaff (Staff  data){
        Staff result =  staffrepository.save(data);
        return result;
    }

    public List<Staff> getallstaff (){
        return  staffrepository.findAll();
    }

    public Staff updatestaff (Staff data){
        return staffrepository.save(data);
    }

    public Staff getbyid(Long Id){
        return staffrepository.findById(Id).orElseThrow(()-> new RuntimeException("Todo not found"));
    }
}
