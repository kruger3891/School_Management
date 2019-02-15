package Project.School_Management.DataAccess;

import java.util.List;

import Project.School_Management.Models.Course;

public interface CourseDAO {

	Course saveCourse(Course course);

	Course findById(int id);

	List<Course> findByName(String name);

	List<Course> findAll();

	boolean removeCourse(Course course);

	void ToPrintCourse(Course course);

}