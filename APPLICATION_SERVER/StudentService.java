package APPLICATION_SERVER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/students/{id}")
    public Student getStudentByid(@PathVariable int id){
       return studentDAO.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/students/{id}")
    public void addStudent(@RequestBody Student student){
        studentDAO.addStudent(student);
    }
    @RequestMapping(method = RequestMethod.PUT,value="/students/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable String id ){
        studentDAO.updateStudent(id,student);
    }
    @RequestMapping(method = RequestMethod.DELETE,value="/students/{id}")
    public void delete(@PathVariable String id ){
        studentDAO.deleteStudent(id);
    }



}
