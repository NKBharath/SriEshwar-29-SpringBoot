package SriEshwar.project.Respository;

import SriEshwar.project.Models.Staff;
import SriEshwar.project.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository  <Staff, Long> {
}
