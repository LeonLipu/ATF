package APPLICATION_SERVER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by brahmanandakar on 18/07/17.
 */
@RestController
public class StudentService {

    @Autowired
    public StudentDAO studentDAO;

    @CrossOrigin("*")
    @RequestMapping("/students")
    public List<Student> getallStudent(){
        return studentDAO.getAllStudent();
    }
}
