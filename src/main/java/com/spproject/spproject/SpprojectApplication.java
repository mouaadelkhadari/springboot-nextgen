package com.spproject.spproject;

import com.spproject.spproject.dao.StudentDAO;
import com.spproject.spproject.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/* @SpringBootApplication(
		scanBasePackages = {
				"com.spproject.spproject",
				"com.spproject.util"
		}
)
*/
@SpringBootApplication
public class SpprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return args -> {
			//saveStudent(studentDAO);
			createMultiplStudent(studentDAO);
		};
	}

	private void createMultiplStudent(StudentDAO studentDAO) {

		Student student1 = new Student("brahim", "diaz", "brahimdiaz@mail.com");
		Student student2 = new Student("leo", "messi", "leomessi@mail.com");
		Student student3 = new Student("yassine", "bounou", "yassinebounou@mail.com ");

		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
	}

	private void saveStudent(StudentDAO studentDAO) {

		Student student = new Student("mouaad", "elkhadari", "mouaad@mail.com" );


		studentDAO.save(student);

		System.out.println("Saved student. Generated Id : "+ student.getId());
	}


}
