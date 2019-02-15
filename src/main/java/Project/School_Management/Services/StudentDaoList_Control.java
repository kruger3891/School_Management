package Project.School_Management.Services;

import java.util.*;

import Project.School_Management.DataAccess.CourseDaoList;
import Project.School_Management.DataAccess.StudentDaoList;
import Project.School_Management.Models.Course;
import Project.School_Management.Models.Student;

public class StudentDaoList_Control {

	static Scanner in = new Scanner(System.in);
	private static CourseDaoList theCoursesList = new CourseDaoList();
	static StudentDaoList theStudentList = new StudentDaoList();

	public static StudentDaoList createStudentListDaoList() {
		Student STD = new Student("name", "email", "address" , "STD");
		System.out.println("Pls Add The Name ");
		String Name = in.next();
		STD.setName(Name);
		System.out.println("Student Name Has Been Added ");
		System.out.println("Pls Add The Email");
		String Email = in.next();
		STD.setEmail(Email);
		System.out.println("Student Email Has Been Added ");
		System.out.println("Pls Add The Address");
		String Address = in.next();
		STD.setAddress(Address);
		System.out.println("Student Address Has Been Added ");
		theStudentList.saveStudent(STD);
		STD.ToPrint();
		System.out.println("Student Has Been Stored");
		return theStudentList;
	}

	public static StudentDaoList findById() {
		System.out.println("Enter the Student id:");
		int id = in.nextInt();
		theStudentList.findById(id);
		System.out.println(theStudentList.findById(id));
		return theStudentList;
	}

	public static StudentDaoList findByName() {
		System.out.println("Enter the Student Name:");
		String name = in.next();
		theStudentList.findByName(name);
		System.out.println(theStudentList.findByName(name));
		return theStudentList;

	}

	public static StudentDaoList findByEmail() {
		System.out.println("Enter the Student email:");
		String email = in.nextLine();
		theStudentList.findByEmail(email);
		System.out.println(theStudentList.findByEmail(email));
		return theStudentList;

	}

	public static StudentDaoList DeleteStudent() {
		System.out.println("Please Enter The Student ID ");
		int id = in.nextInt();
		Student result = theStudentList.findById(id);
		System.out.println(theStudentList.deleteStudent(result));
		return theStudentList;

	}

	public static StudentDaoList ShowAll() {

		System.out.println(theStudentList.findAll());
		return theStudentList;
	}
	
	public static StudentDaoList AddToCourse() {
		System.out.println("Be Sure That You Have The Student ID & The Course ID");
		System.out.println("Enter the Student id:");
		int Studentid = in.nextInt();
		theStudentList.findById(Studentid);
		System.out.println(theStudentList.findById(Studentid));
		Student Result1=theStudentList.findById(Studentid);
		System.out.println("Enter the Course id:");
		int Courseid = in.nextInt();
		theCoursesList.findById(Courseid);
		System.out.println(theCoursesList.findById(Courseid));
		Course Result2 =theCoursesList.findById(Courseid);
		String pcikCourseName = Result2.getCourseName();
		Result1.setCourse(pcikCourseName);
		System.out.println("Student Has Been Added To The Course");
		System.out.println(Result1);
		return theStudentList;
		
	}
}