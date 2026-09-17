package SriEshwar.project;

import SriEshwar.project.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository  <Student, Long> {
}
