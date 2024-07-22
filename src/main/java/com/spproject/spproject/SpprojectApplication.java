package com.spproject.spproject;

import com.spproject.spproject.dao.StudentDAO;
import com.spproject.spproject.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


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
			//deleteAllStudent(studentDAO);
			//deleteStudent(studentDAO);
            //updateFirstNameOfStudent(studentDAO);
            //findStudentsByLastName(studentDAO);
            //getAllStudents(studentDAO);
			//readStudent(studentDAO);
			//saveStudent(studentDAO);
			//createMultiplStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		//deleting all students
		int c = studentDAO.deleteAll();
		System.out.println("deleted rows: " + c);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		Long id = 3015L;
		studentDAO.delete(id);
		System.out.println("Student deleted with success");
	}

	private void updateFirstNameOfStudent(StudentDAO studentDAO) {
        //find user by id
        Long id = 6894L;
        Student student = studentDAO.readStudent(id);
        // change the first name of the student
        student.setFirstName("musiala");
        student.setLastName("jamal");
        studentDAO.update(student);
    }

    private void findStudentsByLastName(StudentDAO studentDAO) {

        List<Student> students = studentDAO.findByLastName("diaz");

        for(Student s : students){
            System.out.println(students);
        }
    }

    private void getAllStudents(StudentDAO studentDAO) {

        List<Student> students = studentDAO.findAll();

        for(Student s : students){
            System.out.println(s);
        }
    }


    private void readStudent(StudentDAO studentDAO){
		// create a new student
		Student studentImp = new Student("harry", "potter", "harrypoteer@mail.com");
		studentDAO.save(studentImp);

		Long studentId = studentImp.getId();
		System.out.println("Student id is: "+ studentImp.getId());

		Student myStudent =  studentDAO.readStudent(studentId);
		System.out.println("information of student: "+ myStudent);
	}

	private void createMultiplStudent(StudentDAO studentDAO) {

		Student student1 = new Student("brahim", "diaz", "brahim@mail.com");
		Student student2 = new Student("leo", "messi", "leo@mail.com");
		Student student3 = new Student("yassine", "bounou", "yassine@mail.com ");

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
