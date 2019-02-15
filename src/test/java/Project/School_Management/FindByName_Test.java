package Project.School_Management;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Project.School_Management.DataAccess.StudentDaoList;
import Project.School_Management.Models.Student;

public class FindByName_Test {

	// This is what we are going to test
	private StudentDaoList underTest = new StudentDaoList();

	// Is used in findById test
	private Student TestStudent;
	private int TestStudentid;

	// Runs BEFORE each test
	@Before
	public void init() {
		TestStudent = new Student("yamen1", "ya@g.com", "address", "course");
		underTest.saveStudent(TestStudent);
		TestStudentid = TestStudent.getID();
		underTest.saveStudent(new Student("yamen2", "asdsad", "sada", "dsaddas"));
	}

	@Test
	public void test_findByName() {
		String param = "Test";

		List<Student> result = underTest.findByName(param);
		for (Student p : result) {
			assertEquals(param, p.getName());
		}
	}

}
