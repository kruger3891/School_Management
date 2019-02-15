package Project.School_Management.Utilites;

import java.util.Scanner;

public class DoYouWannaDoMore {
	static Scanner in = new Scanner(System.in);

	public static boolean PlaySystemAgain(String answer) {

		String upperCaseString = answer.toUpperCase();
		switch (upperCaseString) {
		case "Y":
			System.out.println("System Open Again");
			return true;
		default:
			System.out.println(" ಠ_ಠ   See You Soon ಠ_ಠ");
			return false;
		}
	}

	public static String GetPlaySystemAgainAnswer() {
		return in.nextLine();
	}

}
