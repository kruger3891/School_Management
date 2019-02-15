package Project.School_Management.DataAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Project.School_Management.Models.Course;
import Project.School_Management.Models.Student;

public class CourseDaoList implements CourseDAO {

	static Scanner in = new Scanner(System.in);

	static List<Course> CoursesList = new ArrayList<>();

	public Course saveCourse(Course course) {
		if (course == null) {
			throw new IllegalArgumentException();

		} else {
			CoursesList.add(course);
			System.out.println(CoursesList);
			return course;
		}
	}

	@Override
	public Course findById(int id) {
		for (Course COR : CoursesList) {
			if (COR.getCourseID() == id) {
				return COR;
			}
		}
		return null;
	}

	@Override
	public List<Course> findByName(String name) {
		List<Course> result = new ArrayList<>();
		for (Course COR : CoursesList) {
			if (COR.getCourseName().equalsIgnoreCase(name)) {
				result.add(COR);
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
		for (Course COR : CoursesList) {
			System.out.println("Course Has Been Removed");
			return CoursesList.remove(COR);
		}
		return false;
	}

	@Override
	public void ToPrintCourse(Course course) {
		for (Course COR : CoursesList) {
			System.out.println(COR);
		}
	}
}
