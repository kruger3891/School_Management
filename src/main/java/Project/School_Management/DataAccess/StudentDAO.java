package Project.School_Management.DataAccess;

import java.util.List;

import Project.School_Management.Models.Student;

public interface StudentDAO {

	Student saveStudent(Student student);

	List<Student> findByEmail(String email);

	List<Student> findByName(String name);

	Student findById(int id);

	List<Student> findAll();

	boolean deleteStudent(Student student);
	

}
