package Project.School_Management;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import Project.School_Management.DataAccess.CourseDao_impl;
import Project.School_Management.Models.Course;

public class Course_Test {

	private CourseDao_impl underTest=new CourseDao_impl();
	private Course testCourse;
	private int corId;
	
	
	@Before
	public void init() {
		testCourse = new Course("Java", 24);
		underTest.saveCourse(testCourse);
		corId=testCourse.getCourseID();
		underTest.saveCourse(new Course("HTML", 18));
	}
	@Test
	public void saveNewCourse () {
		
		Course expected = new Course("C++", 20);	
		assertEquals(expected,underTest.saveCourse(expected));
	}
	@Test
	public void test_findById_return_testCourse() {
		assertEquals(testCourse,underTest.findById(corId));
		
	}
	@Test
	public void test_findByName() {
		String param = "Test";
		List<Course> result=new ArrayList<Course>();
		for (Course c : result) {
			assertEquals(param, c.getCourseName());
	}
	}
}
	