package Project.School_Management;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Project.School_Management.DataAccess.StudentDaoList;
import Project.School_Management.Models.Student;

public class FindBy_IdTest {

	// This is what we are going to test
	private StudentDaoList underTest = new StudentDaoList();

	// Is used in findById test
	private Student TestStudent;
	private int TestStudentid;

	// Runs BEFORE each test
	@Before
	public void init() {
		TestStudent = new Student("yamen", "ya@g.com", "address", "course");
		underTest.saveStudent(TestStudent);
		TestStudentid = TestStudent.getID();
		underTest.saveStudent(new Student("yamen2", "asdsad", "sada", "dsaddas"));
	}

	@Test
	public void test_findById_return_testPerson() {
		assertEquals(TestStudent, underTest.findById(TestStudentid));
	}

}
