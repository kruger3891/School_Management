package Project.School_Management.Services;

import Project.School_Management.Utilites.DoYouWannaDoMore;
import Project.School_Management.Utilites.InputValidNumberAsTheList;

public class Case2 {
	
	public static void CaseTwoActions () {
		
		System.out.println("Welcome to Course Section" + "\n20-|| Add New Course ||"
				+ "\n21-||     Search     ||" + "\n22-||     Delete     ||"
				+ "\n23-||     Find All   ||");
		int Selections = InputValidNumberAsTheList.inputNumber(20, 23);

		boolean running = true;
		
		while (running) {
			
		if (Selections == 20) {
			System.out.println("You Can Add Here");
			CoursDaoList_Control.CreatNewCourse();
			break;
		}

		if (Selections == 21) {
			System.out.println("Please Select" + "\n211-||  By Name  ||" + "\n212-||  By Id    ||");
			Selections = InputValidNumberAsTheList.inputNumber(211, 212);

			if (Selections == 211) {
				CoursDaoList_Control.findByName();
				break;
			}

			if (Selections == 212) {
				CoursDaoList_Control.findById();
				break;
			}						
			break;
		}

		if (Selections == 22) {
			System.out.println("You Can Delete Here");
			CoursDaoList_Control.removeCourse();
			break;}
			
		if (Selections == 23) {
				CoursDaoList_Control.findAll();
				break;}
		
		System.out.println("Do You Want Open The System Again ? (Y/N)");
		String answer = DoYouWannaDoMore.GetPlaySystemAgainAnswer().toUpperCase();
		running = DoYouWannaDoMore.PlaySystemAgain(answer);
	}
	}
}
