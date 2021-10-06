package workplease;

import java.util.Scanner;

public class Marathon {
	public static void main(String[] args) {
		// General Information
		System.out.print("Programming Fundamentals");
		System.out.println("NAME: Mathew Golf");
		System.out.println("PROGRAMMING ASSIGNMENT 3\n");
		System.out.println("Please enter 'last' and '0' to terminate\n");
		
		// Arrays of length 20
		final int LIM = 20;
		double[] times = new double[LIM];
		String[] names = new String[LIM];
		Scanner scan = new Scanner(System.in);
		
		// Get User Input
		for(int i=0; i<LIM; i++) {
			System.out.print("Please Enter the name: ");
			names[i] = scan.next();
			System.out.print("Please Enter the time: ");
			times[i] = scan.nextInt();
			System.out.println();
			if (names[i] == "LAST" || times[i] == 0) {
				break;
			}
		}
		// Find the Number of non-Null Entries
		int newSize = 0;
		for(int i=0; i<names.length; i++) {
			if(names[i] != null) {
				newSize++;
			}
		}
		// Create a new array for the number of entries
		String[] newNames = new String[newSize];
		int newIndex = 0;
		for(int i=0; i<names.length; i++) {
			if(names[i] != null) {
				newNames[newIndex] = names[i];
				newIndex++;
			}
		}
		// Create a new array for the number of entries
		double[] newTimes = new double[newSize];
		int newerIndex = 0;
		for(int i=0; i<times.length; i++) {
			if(times[i] != 0.0) {
				newTimes[newerIndex] = times[i];
				newerIndex++;
			}
		}
		


		// Print the Menu Options
		int option = 0;
		while(true) {
			System.out.print("\nPlease choose one of the following:");
			System.out.println("\n1- Find Fastest\n2- Find Slowest\n3- Sort\n4- Exit");
			System.out.println("Please select an option: ");
			option = scan.nextInt();
			switch (option) {
				case 1:
					SortStudents(newNames, newTimes);
					FindFastest(newNames, newTimes);
					break;
				case 2:
					SortStudents(newNames, newTimes);
					FindSlowest(newNames, newTimes);
					break;
				case 3:
					SortStudents(newNames, newTimes);
					System.out.println("\nThe sorted students are:");
//					for(String str: newNames) {
//						System.out.println(str);
//						for(double dbl : newTimes) {
//							System.out.print(dbl); //use the slowest printing - iterate through a for loop over length of the array
//						}
					for(int i=0; i<newNames.length; i++){
						System.out.println(newNames[i]);
						for(int j=0; j<newTimes.length; j++){
							System.out.print(" "+newTimes[j]);}}
					//}
					System.out.println();
					break;
				case 4:
					System.out.println("Good bye!");
					return;
				default:
					System.out.println("Not a valid option!");
			}
		}
	}

		// Sort the Students
		public static void SortStudents(String[] newNames, double[] newTimes) {
			double temp1 = 0;
			String temp2 = "";
			for (int i=0; i<newNames.length; i++) {
				for (int j=i+1; j<newNames.length; j++) {
					if(newTimes[i]>newTimes[j]) {
						temp1 = newTimes[i];
						newTimes[i] = newTimes[j];
						newTimes[j] = temp1;
						
						temp2 = newNames[i];
						newNames[i] = newNames[j];
						newNames[j] = temp2;
					}
				}
			}
		}
		
		// Fastest Students
		public static void FindFastest(String[] newNames, double[] newTimes) {
			System.out.println("\nThe fastest three students are:");
			System.out.println(newNames[(newNames.length)-1]+" "+newTimes[(newTimes.length)-1]);
			System.out.println(newNames[(newNames.length)-2]+" "+newTimes[(newTimes.length)-2]);
			System.out.println(newNames[(newNames.length)-3]+" "+newTimes[(newTimes.length)-3]);
		}
		
		// Slowest Students
		public static void FindSlowest(String[] newNames, double[] newTimes) {
			System.out.println("\nThe slowest three students are:");
			System.out.println(newNames[0]+" "+newTimes[0]);
			System.out.println(newNames[1]+" "+newTimes[1]);
			System.out.println(newNames[2]+" "+newTimes[2]);
}
}
