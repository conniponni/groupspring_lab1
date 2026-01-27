package se.iths.groupspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.groupspring.model.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String getStudents(Model model) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1L, "Anna", "Andersson", "Java Developer"));
        students.add(new Student(2L, "Erik", "Eriksson", "Frontend Developer"));
        students.add(new Student(3L, "Maria", "Karlsson", "Systemutveckling"));

        model.addAttribute("students", students);

        return "students";
    }
}
