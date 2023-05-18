package chocaholicsAnonymous;

import java.util.*;
/**
* The operatorTerminal class is the terminal for operators that will display the options to either edit members or providers
*
* @author Liam Kelly
* @version 1.0
*/
public class operatorTerminal {
	public memberDatabase memberData;
	public ArrayList<Member> members;
	public providerDatabase providerData;
	public ArrayList<Provider> providers;
	/**
	 * Would start the editMember method to add/edit/delete members
	 * @param members is the array that holds all members in the database
	 */
	public void displayMemberOptions(ArrayList<Member> members) {
		operatorController.editMember(members);
	}
	/**
	 * Would start the editProvider method to add/edit/delete providers
	 * @param providers is the array that holds all providers in the database
	 */
	public void displayProviderOptions(ArrayList<Provider> providers) {
		operatorController.editProvider(providers);
	}
	/**
	 * Would display the menus and call all of the arrays for members and providers
	 */
	public void displayMenu() {
		memberData = new memberDatabase();
		members = memberData.getMemberList();
		providerData = new providerDatabase();
		providers = providerData.getProviderList();
		// System.out.println("Welcome to Chocaholics Anonymous! /n You are now in the
		// Operator Terminal. /n Please make a selection from the following options.");
		// System.out.println("1. Enter 'P' to access Providers");
		// System.out.println("2. Enter 'M' to acceess Members");
		// System.out.println("3. Enter 'L' to Logout of the Operator Terminal");
		// c = (char) System.in.read();
		Scanner sc1 = new Scanner(System.in);
		String option;
		while (true) {
			System.out.println(
					"Welcome to Chocaholics Anonymous! \n You are now in the Operator Terminal. \n Please make a selection from the following options.");
			System.out.println("1. Enter 'P' to access Providers");
			System.out.println("2. Enter 'M' to acceess Members");
			System.out.println("3. Enter 'L' to Logout of the Operator Terminal");
			option = sc1.nextLine().toUpperCase();
			if (option.equals("P")) {
				displayProviderOptions(providers);
				continue;
			} else if (option.equals("M")) {
				displayMemberOptions(members);
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
	/**
	 * Logs user out of system
	 */
	public void logout() {
		System.out.println("Thank you for choosing Chocaholics Anonymous!");
		return;
	}

}