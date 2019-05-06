package Project.School_Management.DataAccess;

import java.util.ArrayList;
import java.util.List;
import Project.School_Management.Models.Course;

public class CourseDao_impl implements CourseDAO {

	static List<Course> CoursesList = new ArrayList<>();

	public Course saveCourse(Course course) {
		if (course == null) {
			throw new IllegalArgumentException();

		} else {
			CoursesList.add(course);
			return course;
		}
	}

	@Override
	public Course findById(int id) {
		for (Course cor : CoursesList) {
			if (cor.getCourseID() == id) {
				cor.ToPrint();
			}
		}
		return null;
	}

	@Override
	public List<Course> findByName(String name) {
		List<Course> result = new ArrayList<>();
		for (Course cor : CoursesList) {
			if (cor.getCourseName().equalsIgnoreCase(name)) {
				result.add(cor);
			}
		}
		return result;
	}

	@Override
	public List<Course> findAll() {
		return CoursesList;
	}

	@Override
	public boolean removeCourse(Course course) {
		for (Course cor : CoursesList) {
			System.out.println("Course Has Been Removed");
			return CoursesList.remove(cor);
		}
		return false;
	}

	@Override
	public void toPrintCourse(Course course) {
		for (Course cor : CoursesList) {
			System.out.println(cor);
		}
	}
}