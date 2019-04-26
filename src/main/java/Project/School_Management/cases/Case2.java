package Project.School_Management.cases;

import Project.School_Management.Services.CoursDaoList_Control;
import Project.School_Management.utility.ScannerInputDAO;
import Project.School_Management.utility.ScannerInputDAO_impl;


public class Case2 {
	
	static CoursDaoList_Control course_control=new CoursDaoList_Control();
	private static  ScannerInputDAO scanerInput=new ScannerInputDAO_impl();
	
	public static void caseTwoActions () {
		
		System.out.println("Welcome to Course Section" + "\n20-|| Add New Course ||"
				+ "\n21-||     Search     ||" + "\n22-||     Delete     ||"
				+ "\n23-||     Find All   ||");
		int selections = scanerInput.inputNumber(20, 23);
		
		boolean running = true;
		
		while (running) {
			
		if (selections == 20) {
			System.out.println("You Can Add Here");
			course_control.CreatNewCourse();
			break;
		}

		if (selections == 21) {
			System.out.println("Please Select" + "\n211-||  By Name  ||" + "\n212-||  By Id    ||");
			selections = scanerInput.inputNumber(211, 212);

			if (selections == 211) {
				course_control.findByName();
				break;
			}

			if (selections == 212) {
				course_control.findById();
				break;
			}						
			break;
		}

		if (selections == 22) {
			System.out.println("You Can Delete Here");
			course_control.removeCourse();
			break;}
			
		if (selections == 23) {
			course_control.findAll();
				break;}
		
	}
	}
}