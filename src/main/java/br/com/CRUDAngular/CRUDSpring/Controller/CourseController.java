package br.com.CRUDAngular.CRUDSpring.Controller;

import br.com.CRUDAngular.CRUDSpring.Model.Course;
import br.com.CRUDAngular.CRUDSpring.Repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course createCourse(@RequestBody Course course){
        return courseRepository.save(course);
    }

}
