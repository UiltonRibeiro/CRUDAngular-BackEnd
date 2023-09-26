package br.com.CRUDAngular.CRUDSpring;

import br.com.CRUDAngular.CRUDSpring.Model.Course;
import br.com.CRUDAngular.CRUDSpring.Repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();
			Course course = new Course();
			course.setName("Angular");
			course.setCategoria("Front-end");
			courseRepository.save(course);
		};
	}
}
