package Project.School_Management.cases;

import java.util.Date;

import Project.School_Management.utility.ScannerInputDAO;
import Project.School_Management.utility.ScannerInputDAO_impl;

public class Operation {

	private static ScannerInputDAO scanerInput = new ScannerInputDAO_impl();

	public static void Go() {

		boolean running = true;
		Date date = new Date();
		while (running) {

			System.out.println("====================================");
			System.out.println("||Welcome To our School Management||");
			System.out.println("====================================");
			System.out.println("====" + date.toString() + "====");
			System.out.println("\nPlease Select From The List" + "\n1-|| Students  ||" + "\n2-|| Courses  ||"
					+ "\n3-||  info    ||");

			int Selections = scanerInput.inputNumber(1, 3);

			switch (Selections) {

			case 1:
				Case1.caseOneActions();
				break;

			case 2:
				Case2.caseTwoActions();
				break;

			case 3:
				System.out.println("===========================");
				System.out.println("Designed By Mogamed & Yamen");
				System.out.println("==========Thanks===========");
				System.out.println("===========================");
				running = false;
				break;

			default:
				System.out.println("Worng Entry PLs check the Options");
			}

			System.out.println("Do You Want Open The System Again ? (Y/N)");
			running = scanerInput.PlaySystemAgain();
		}
	}
}