package Project.School_Management.cases;

import Project.School_Management.Services.StudentDaoList_Control;
import Project.School_Management.utility.ScannerInputDAO;
import Project.School_Management.utility.ScannerInputDAO_impl;


public class Case1 {
	
	static StudentDaoList_Control student_control= new StudentDaoList_Control();
	private static  ScannerInputDAO scanerInput=new ScannerInputDAO_impl();
	
	public static void caseOneActions () {
				
		System.out.println("Welcome to Student Section" + "\n10-|| Add New Student ||"
				+ "\n11-||     Search      ||" + "\n12-||     Delete      ||" +
				  "\n13-||     Show All    ||" +"\n14-||    ADD Course    ||");
		
		int selections = scanerInput.inputNumber(10, 14);
		
		boolean running = true;
		
		while (running) {
			
		if (selections == 10) {
			System.out.println("You Can Add Here");
			student_control.createStudentListDaoList();
			break;
		}
		if (selections == 11) {
			System.out.println("Please Select" + "\n111-||  By Name  ||" + "\n112-||  By Id    ||"
					+ "\n113-||  By Email ||");
			selections = scanerInput.inputNumber(111, 113);

			if (selections == 111) {
				student_control.findByName();
				break;
			}

			if (selections == 112) {
				student_control.findById();
				break;
			}

			if (selections == 113) {
				student_control.findByEmail();
				break;
			}

			break;
		}
		if (selections == 12) {
			System.out.println("You Can Delete Here");
			student_control.DeleteStudent();
			break;
		}
		if (selections == 13) {
			System.out.println("Student List");
			student_control.ShowAll();
			break;
		}
		
		if (selections == 14) {
			System.out.println("Select and add");
			student_control.AddToCourse();
			break;}
		
	}
	}
}