package com.training.studentdemo.controller;
import com.training.studentdemo.model.Student;
import com.training.studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("getAllStudentData")
    public List<Student> getall(){
        return studentService.getall();

    }
    @PostMapping("/saveStudentData")
    public Student saveStudent(@RequestBody Student student){
        return studentService.addstudent(student);

    }

    @DeleteMapping("/deleteStudent/{id}")
    public String getDelete(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

    @PutMapping ("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updatestudent(student);

    }
}

