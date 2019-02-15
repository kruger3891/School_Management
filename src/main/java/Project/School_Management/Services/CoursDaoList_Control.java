package Project.School_Management.Services;


import java.util.Scanner;

import Project.School_Management.DataAccess.CourseDaoList;
import Project.School_Management.Models.Course;
import Project.School_Management.Models.Student;
import Project.School_Management.Utilites.InputValidNumberAsTheList;

public class CoursDaoList_Control {

	private static Scanner in = new Scanner(System.in);
	private static CourseDaoList theCoursesList = new CourseDaoList();

	public static CourseDaoList CreatNewCourse() {

		Course COR = new Course("C++", 6);
		System.out.println("Pls Add The Course Name ");
		String CourseName = in.next();
		COR.setCourseName(CourseName);
		System.out.println("Course Name Has Been Added ");
		System.out.println("Pls Add The Course WeekDuration 1 TO 36");
		int WeekDuration = InputValidNumberAsTheList.inputNumber(1, 36);
		COR.setWeekDuration(WeekDuration);
		theCoursesList.saveCourse(COR);
		COR.ToPrint();
		System.out.println("Course WeekDuration Has Been Added ");
		return theCoursesList;

	}

	public static CourseDaoList findById() {
		System.out.println("Enter the Course id:");
		int id = in.nextInt();
		theCoursesList.findById(id);
		System.out.println(theCoursesList.findById(id));
		return theCoursesList;
	}

	public static CourseDaoList findByName() {
		System.out.println("Enter the course Name:");
		String name = in.nextLine();
		theCoursesList.findByName(name);
		return theCoursesList;

	}

	public static void findAll() {
		System.out.println(theCoursesList.findAll());
	}

	public static CourseDaoList removeCourse() {
		System.out.println("by id please enter the Course id ");
		int id = in.nextInt();
		theCoursesList.ToPrintCourse(theCoursesList.findById(id));
		Course course = theCoursesList.findById(id);
		theCoursesList.removeCourse(course);
		return theCoursesList;
	}
	
	
	
	public static CourseDaoList AddStudentToCourse () {
		
		return theCoursesList;
			
	}
}
