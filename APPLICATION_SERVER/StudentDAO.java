package APPLICATION_SERVER;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by brahmanandakar on 18/07/17.
 */
@Service
public class StudentDAO {


    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("1", "brahmananda", "kar", "Btech"),
            new Student("2", "nitin", "jain", "Btech"),
            new Student("3", "durga", "rao", "mca"),
            new Student("4", "srinivas", "samvedam", "Btech"),
            new Student("5", "utkarsh", "naik", "Btech")));


    public List<Student> getAllStudent() {
        return students;
    }

    public Student getStudentById(int id ){
        return students.get(id);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void updateStudent(String id ,Student student){


        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId()==id) {
                students.set(i,student);
                return;
            }

            }

        }


    public void deleteStudent(String id ){
        students.remove(id);
    }




}
