package Project.School_Management.Services;


import java.util.Date;

import Project.School_Management.Utilites.InputValidNumberAsTheList;

public class Operation {

	static boolean Running = true;
	static Date date = new Date();
	public static void Go() {

		
		while (Running) {
			
			System.out.println("====================================");
			System.out.println("||Welcome To our School Management||");
			System.out.println("====================================");
			System.out.println("===="+ date.toString() +"====");
			System.out.println(
					"\nPlease Select From The List" + "\n1-|| Student ||" + "\n2-|| Courses ||" + "\n3-||  info   ||");

			int Selections = InputValidNumberAsTheList.inputNumber(1, 3);

			switch (Selections) {

			case 1:
				Case1.CaseOneActions();
				break;

			case 2:
				Case2.CaseTwoActions();
				break;

			case 3:
				System.out.println("===========================");
				System.out.println("Designed By Mogamed & Yamen");
				System.out.println("==========Thanks===========");
				System.out.println("===========================");
				Running = false;
				break;

			default:
				System.out.println("Worng Entry PLs check the Options");
			}
		}
	}
}