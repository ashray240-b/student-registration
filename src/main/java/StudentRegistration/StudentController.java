package StudentRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import StudentRegistration.entity.Student;
import StudentRegistration.repository.StudentRepository;

@Controller

public class StudentController {
	

	    @Autowired
	    private StudentRepository repo;

	    @GetMapping("/register")
	    public String showForm() {
	        return "register";
	    }

	    @PostMapping("/save")
	    public String saveStudent(@ModelAttribute Student student) {
	        repo.save(student);
	        return "redirect:/students";
	    }

	    @GetMapping("/students")
	    public String viewStudents(Model model) {
	        model.addAttribute("students", repo.findAll());
	        return "students";
	    }
	

}
