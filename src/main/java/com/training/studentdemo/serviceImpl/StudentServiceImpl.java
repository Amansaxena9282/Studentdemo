package com.training.studentdemo.serviceImpl;

import com.training.studentdemo.model.Student;
import com.training.studentdemo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getall() {
//        return null;
        List<Student> getall=new ArrayList<>();
        Student s1=new Student((long)1,"aman",23);
        Student s2=new Student((long)2,"kamal",25);
        Student s3=new Student((long)3,"aarav",24);
        getall.add(s1);
        getall.add(s2);
        getall.add(s3);
        return getall();
    }

    @Override
    public Student addstudent(Student student) {
        return student;
    }

    @Override
    public Student updatestudent(Student student) {
        return student;
    }

    @Override
    public Student deletestudent(Long id) {
        return null;
    }

    @Override
    public String deleteStudent(Long id) {
        return "deleteid:"+id;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }
}
