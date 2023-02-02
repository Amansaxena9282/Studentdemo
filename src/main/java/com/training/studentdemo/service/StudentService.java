package com.training.studentdemo.service;
import com.training.studentdemo.model.Student;

import java.util.List;
public interface StudentService {
    //get method   (for get the data)
    public List<Student> getall();
    //post method   ( for data insertion )
    public Student addstudent(Student student);
    // put method   (for data updation)
    public Student updatestudent(Student student);
    public Student deletestudent(Long id);

    public String deleteStudent(Long id);

//

   public Student updateStudent(Student student);
}
