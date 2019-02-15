package Project.School_Management;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import Project.School_Management.DataAccess.StudentDaoList;
import Project.School_Management.Models.Student;


public class test_findByName {

	// This is what we are going to test
	private StudentDaoList underTest = new StudentDaoList();

	// Is used in findById test
	private Student TestStudent;
	private int TestStudentid;

	// Runs BEFORE each test
	@Before
	public void init() {
		TestStudent = new Student("name", "email", "address", "course");
		underTest.saveStudent(TestStudent);
		TestStudentid = TestStudent.getID();
		underTest.saveStudent(new Student("Test", "Testsson2", "sada", "dsaddas"));
	}

	@Test
	public void test_findByName_with_lambda() {
		String param = "Test";

		List<Student> result = underTest.findByName(param);

		assertTrue(result.stream().allMatch(TestStudent -> TestStudent.getName().equals(param)));
	}
}
