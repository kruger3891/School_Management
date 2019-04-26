package Project.School_Management.Services;

import Project.School_Management.DataAccess.CourseDao_impl;
import Project.School_Management.Models.Course;
import Project.School_Management.utility.ScannerInputDAO;
import Project.School_Management.utility.ScannerInputDAO_impl;


public class CoursDaoList_Control {

	private  ScannerInputDAO scanerInput=new ScannerInputDAO_impl();
	private  CourseDao_impl theCoursesList = new CourseDao_impl();

	public  CourseDao_impl CreatNewCourse() {
		
		Course cor = new Course("C++", 6);
		System.out.println("Pls Add The Course Name ");
		String courseName = scanerInput.getString();
		cor.setCourseName(courseName);
		System.out.println("Course Name Has Been Added ");
		System.out.println("Pls Add The Course WeekDuration 1 TO 36");
		int weekduration = scanerInput.inputNumber(1, 36);
		cor.setWeekDuration(weekduration);
		theCoursesList.saveCourse(cor);
		cor.ToPrint();
		System.out.println("Course WeekDuration Has Been Added ");
		return theCoursesList;

	}

	public  CourseDao_impl findById() {
		System.out.println("Enter the Course id:");
		int id = scanerInput.getInt();
		theCoursesList.findById(id);
		System.out.println(theCoursesList.findById(id));
		return theCoursesList;
	}

	public  CourseDao_impl findByName() {
		System.out.println("Enter the course Name:");
		String name = scanerInput.getString();
		theCoursesList.findByName(name);
		return theCoursesList;

	}

	public  void findAll() {
		System.out.println(theCoursesList.findAll());
	}

	public  CourseDao_impl removeCourse() {
		System.out.println("by id please enter the Course id ");
		int id = scanerInput.getInt();
		theCoursesList.toPrintCourse(theCoursesList.findById(id));
		Course course = theCoursesList.findById(id);
		theCoursesList.removeCourse(course);
		return theCoursesList;
	}
	
	
	
	public  CourseDao_impl AddStudentToCourse () {
		
		return theCoursesList;	
	}
}
