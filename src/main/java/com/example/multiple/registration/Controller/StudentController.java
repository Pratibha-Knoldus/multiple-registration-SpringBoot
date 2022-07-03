package com.example.multiple.registration.Controller;

import com.example.multiple.registration.Repository.StudentRepository;
import com.example.multiple.registration.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public List<Student> GetSudents(){
        List<Student> result = new ArrayList<>();

        List<Student> entities = studentRepository.findAll();

        if (entities != null && entities.size() > 0){
            entities.forEach(x->{
                Student item = new Student();
                item.id = x.id;
                /*item.studentNo = x.student_no;
                item.firstName = x.first_name;
                item.lastName = x.last_name;*/
                item.age = x.age;
                item.address = x.address;

                result.add(item);
            });
        }

        return result;
    }
}