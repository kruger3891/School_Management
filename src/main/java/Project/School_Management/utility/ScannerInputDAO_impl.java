package Project.School_Management.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInputDAO_impl implements ScannerInputDAO{

	private Scanner in = new Scanner(System.in);

	@Override
	public String getString() {
		
		return in.nextLine();
	}

	@Override
	public int getInt() {
		
		return in.nextInt();
	}
	
	public  boolean PlaySystemAgain() {

		String upperCaseString = in.nextLine().toUpperCase();
		switch (upperCaseString) {
		case "Y":
			System.out.println("System Open Again");
			return true;
		default:
			System.out.println(" ಠ_ಠ   See You Soon ಠ_ಠ");
			return false;
		}
	}
	
	public  int inputNumber(int startPosition, int endPosition) {
		int number = 0;
		boolean run = true;
		while (run) {
			while (run) {
				try {
					number = in.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Incorrect Input Pls Check The List");
					System.out.print("Enter Number Please... \n");
				} finally {
					in.nextLine();
				}
			}
			if (startPosition == 0 && endPosition == 0)
				endPosition = number;
			if (number >= startPosition && number <= endPosition)
				break;
			else {
				System.out.println(
						"Incorrect Input Pls Select Between: " + startPosition + " <=> " + endPosition + " \n");
			}
		}
		return number;
	}
	
}
