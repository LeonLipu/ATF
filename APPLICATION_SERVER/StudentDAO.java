package APPLICATION_SERVER;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brahmanandakar on 18/07/17.
 */
@Service
public class StudentDAO {

    public List<Student> getAllStudent(){

        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"brahmananda","kar","Btech"));
        students.add(new Student(2,"nitin","jain","Btech"));
        students.add(new Student(3,"durga","rao","mca"));
        students.add(new Student(4,"srinivas","samvedam","Btech"));
        students.add(new Student(5,"utkarsh","naik","Btech"));

        return students;
    }
}
