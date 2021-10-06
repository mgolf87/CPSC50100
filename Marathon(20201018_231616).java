package CPSC50100;
import java.util.Arrays;
import java.util.Scanner;
/* Mathew Golf
 * October 14th 2020
 * CPSC50100 - Fall 1
 * Assignment 3
 */

public class Marathon {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.print("Programming Fundamentals");
		System.out.println("NAME: Mathew Golf");
		System.out.println("PROGRAMMING ASSIGNMENT 3\n");
		
		int  studentTimes[][] = {};
		Scanner scan = new Scanner(System.in);
		
		// Gets the input from the user
		while (studentTimes != 0 || "LAST") {
			System.out.println("Please Enter the name: ");
			studentTimes[][j] = scan.next();
			System.out.println("Please Enter the speed: ");
			studentTimes[i][] = scan.nextInt();
		}
			// Prints the menu option after user input terminated
			int option = 0;
			while (true) {
				System.out.print("\nPlease choose one of the following:");
				System.out.println("\n1- Find Fastest\n2- Find Slowest\n3- Sort\n4- Exit");
				System.out.print("\nPlease select an option: ");
				option = scan.nextInt();
				switch (option) {
					case 1:
						System.out.println();
						FindFastest(studentTimes);
						break;
					case 2:
						FindSlowest(studentTimes);
						break;
					case 3:
						SortStudents(studentTimes);
						break;
					case 4:
						System.out.println("Good bye!");
						return;
				}
			}

			// Finds the fastest students from the sorted array (first 3)
			public static void FindFastest(String[] args) {
				System.out.println("The fastest three students are: ");
				System.out.println(Arrays.toString(studentTimes[0]));
				System.out.println(Arrays.toString(studentTimes[1]));
				System.out.println(Arrays.toString(studentTimes[2]));
	}
	
			// Finds the slowest students from the sorted array (last 3)
			public static void FindSlowest() {
				System.out.println("The slowest three students are: ");
				System.out.println(Arrays.toString(studentTimes[-1]));
				System.out.println(Arrays.toString(studentTimes[-2]));
				System.out.println(Arrays.toString(studentTimes[-3]));
	}

			// Sorts the students by their times = rows
			public static void SortStudents() {
				for (int i = 0; i<studentTimes.length; i++){
					for (int j=i+1; j<studentTimes.length; j++) {
						if (studentTimes[i][] < studentTimes[j][]) {
							temp = studentTimes[i][];
							studentTimes[i][] = studentTimes[j][];
							stuentTimes[j][] = temp;
			}
			}
			}
				System.out.println(Arrays.toString(studentTimes));
			
		}
	}
}
