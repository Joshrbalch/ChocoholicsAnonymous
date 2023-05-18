package chocaholicsAnonymous;

import java.util.*;
/**
* The providerTerminal is what opens when a provider logs in, allowing the user to then select what they want to do and 
* then go to the provider controller to run the method
*
* @author Katie Heath
* @version 1.0
*/
public class providerTerminal {
	serviceRecord serviceRecordDisk = new serviceRecord();
	ArrayList<serviceRecordInfo> serviceRecords = serviceRecordDisk.getServiceRecords();
	public void displayOptions() {
		Scanner sc1 = new Scanner(System.in);
		String option;
		String memberNum;
		while (true) {
			System.out.println("Provider Tools.");
			System.out.println("1. Enter 'D' to get a new Provider Directory.");
			System.out.println("2. Enter 'B' to Bill for Service.");
			System.out.println("3. Enter 'V' to Validate Memember.");
			System.out.println("5. Enter 'R' to Return to Menu.");
			option = sc1.nextLine();
			if (option.equals("D")) {
				providerController.lookupProviderDirectory();
			} else if (option.equals("B")) {
				providerController.billForService(serviceRecords);
			} else if (option.equals("V")) {
				System.out.println("Enter Member Number: ");
				memberNum = sc1.nextLine();
				providerController.validateMember(memberNum);
			} else if(option.equals("R")) {
				return;
			}
		}
	}

	public void displayMenu() {
		Scanner sc1 = new Scanner(System.in);
		String option;
		while (true) {
			System.out.println(
					"Welcome to Chocoholics Anonymous! You are now in the Provider Terminal. Please select from the options below.");
			System.out.println("1. Enter 'P' for Provider Tools");
			System.out.println("2. Enter 'L' to Logout");
			option = sc1.nextLine();
			if (option.equals("P")) {
				displayOptions();
				continue;
			} else if (option.equals("L")) {
				logout();
				break;
			} else {
				System.out.println("Please enter a valid option from the list.");
				continue;
			}
		}
	}

	public void logout() {
		System.out.println("Goodbye");
		return;
	}
}