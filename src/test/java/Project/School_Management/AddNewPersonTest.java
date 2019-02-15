package Project.School_Management;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Project.School_Management.DataAccess.StudentDaoList;
import Project.School_Management.Models.Student;

public class AddNewPersonTest {

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
	public void test_save_on_new_person() {
		Student expected = new Student("Test", "Testquist", "sdasa", "sadsa");
		assertEquals(expected, underTest.saveStudent(expected));
	}

}
