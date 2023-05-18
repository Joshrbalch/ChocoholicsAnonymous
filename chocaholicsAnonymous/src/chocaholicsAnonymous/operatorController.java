package chocaholicsAnonymous;
import java.util.*;
/**
* The oprtatorController holds all the methods to add/edit/delete both members and providers
*
* @author Brodye Stevens
* @version 1.0
*/
public class operatorController{
	/**
	 * Allows user to add/edit/delete members
	 * @param members is the array that holds all of the members
	 */
	public static void editMember(ArrayList<Member> members) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. To add a Member, please enter 'A'.\n");
			System.out.println("2. To edit a Member, please enter 'E'.\n");
			System.out.println("3. To delete a Member, please enter 'D'.\n");
			System.out.println("4. If you are finished, please enter 'Q'.\n");
			String input = sc.nextLine().toUpperCase();
			if(input.equals("A")) {
				addMember(members);
			}
			else if(input.equals("E")){
				editingMember(members);
			}
			else if(input.equals("D")) {
				deleteMember(members);
			}
			else if(input.equals("Q")){
				System.out.println("Returning to Operator Menu\n");
				break;
			}
			else {
				System.out.println(input + "is not an accepted input. Please enter a valid input.\n");
			}
		}
		
		return;
	}
	/**
	 * Allows user to add members
	 * @param members is the array that holds all of the members
	 */
	private static void addMember(ArrayList<Member> members) {
		Scanner addScanner = new Scanner(System.in);
		String decision = "R";
		Member newMember = new Member();
		while(decision.equals("R")) {
			System.out.println("Please enter the member's name.\n");
			newMember.setpersonName(addScanner.nextLine());
			System.out.println("Please enter the member's address.\n");
			newMember.setpersonAddress(addScanner.nextLine());
			System.out.println("Please enter the member's city.\n");
			newMember.setpersonCity(addScanner.nextLine());
			System.out.println("Please enter the member's state.\n");
			newMember.setpersonState(addScanner.nextLine());
			System.out.println("Please enter the member's zip code.\n");
			newMember.setpersonZip(addScanner.nextLine());
			System.out.println("Please enter the member's number.\n");
			newMember.setmemberNum(addScanner.nextLine());
			System.out.println("Please enter the member's status.\n");
			newMember.setmemberStatus(addScanner.nextLine());
			while(true) {
				System.out.println("Here is the new member:\n");
				System.out.println("Name: " + newMember.getpersonName() + "\n");
				System.out.println("Address: " + newMember.getpersonAddress() + "\n");
				System.out.println("City: " + newMember.getpersonCity() + "\n");
				System.out.println("State: " + newMember.getpersonState() + "\n");
				System.out.println("Zip Code: " + newMember.getpersonZip() + "\n");
				System.out.println("Member Number: " + newMember.getmemberNum() + "\n");
				System.out.println("Status: " + newMember.getmemberStatus() + "\n\n");
				System.out.println("(Enter Y to save, N to discard, or R to change)\n");
				decision = addScanner.nextLine().toUpperCase();
				if(decision.equals("Y")) {
					members.add(newMember);
					System.out.println("Member added to database. Returning to menu.\n");
					break;
				}
				else if(decision.equals("N")) {
					System.out.println("New member discarded. Returning to menu.\n");
					break;
				}
				else if (decision.equals("R")) {
					System.out.println("Returning to make changes.\n");
					break;
				}
				else {
					System.out.println("Input not accepted, please enter an accepted input.\n");
				}
			}
			}
		
		return;
		}
	/**
	 * Allows user to edit members
	 * @param members is the array that holds all of the members
	 */
	private static void editingMember(ArrayList<Member> members) {
		Scanner editScanner = new Scanner(System.in);
		Boolean isFound = false;
		String decision = "C";
		String name = "";
		String change = "";
		while(decision.equals("C")) {
			System.out.println("Please enter the name of the member you would like to edit.\n");
			name = editScanner.nextLine();
			for(int i = 0; i < members.size(); i++) {
				if(members.get(i).getpersonName().equals(name)) {
					isFound = true;
					System.out.println("Record found:\n");
					System.out.println("Name: " + name + "\n");
					System.out.println("Address: " + members.get(i).getpersonAddress() + "\n");
					System.out.println("City: " + members.get(i).getpersonCity() + "\n");
					System.out.println("State: " + members.get(i).getpersonState() + "\n");
					System.out.println("Zip Code: " + members.get(i).getpersonZip() + "\n");
					System.out.println("Member Number: " + members.get(i).getmemberNum() + "\n");
					System.out.println("Status: " + members.get(i).getmemberStatus() + "\n\n");
					while(true) {
						System.out.println("Please enter what you would like to change (Name, Address, City, etc.)\n");
						change = editScanner.nextLine().toUpperCase();
						if(change.equals("NAME")) {
							System.out.println("Current name: " + name + "\n");
							System.out.println("Please enter new name.\n");
							members.get(i).setpersonName(editScanner.nextLine());
						}
						else if(change.equals("ADDRESS")) {
							System.out.println("Current address: " + members.get(i).getpersonAddress() + "\n");
							System.out.println("Please enter new address.\n");
							members.get(i).setpersonAddress(editScanner.nextLine());
						}
						else if(change.equals("CITY")) {
							System.out.println("Current city: " + members.get(i).getpersonCity() + "\n");
							System.out.println("Please enter new city.\n");
							members.get(i).setpersonCity(editScanner.nextLine());
						}
						else if(change.equals("STATE")) {
							System.out.println("Current state: " + members.get(i).getpersonState() + "\n");
							System.out.println("Please enter new state.\n");
							members.get(i).setpersonState(editScanner.nextLine());
						}
						else if(change.equals("ZIP CODE") || change.equals("ZIP")) {
							System.out.println("Current zip code: " + members.get(i).getpersonZip() + "\n");
							System.out.println("Please enter new zip code.\n");
							members.get(i).setpersonZip(editScanner.nextLine());
						}
						else if(change.equals("MEMBER NUMBER") || change.equals("NUMBER")) {
							System.out.println("Current member number: " + members.get(i).getmemberNum() + "\n");
							System.out.println("Please enter new member number.\n");
							members.get(i).setmemberNum(editScanner.nextLine());
						}
						else if(change.equals("STATUS")) {
							System.out.println("Current status: " + members.get(i).getmemberStatus() + "\n");
							System.out.println("Please enter new status.\n");
							members.get(i).setmemberStatus(editScanner.nextLine());
						}
						else {
							System.out.println("Input not accepted, please enter input from list of fields.\n");
						}
						System.out.println("Are you finished editing this member? Enter Y if so, or enter N to continue editing.\n");
						String editDecision = editScanner.nextLine().toUpperCase();
						if(editDecision.equals("Y")) {
							System.out.println("Returning to Editing Menu.\n");
							break;
						}
						else if(editDecision.equals("N")) {
							System.out.println("Returning to continue editing.\n");
						}
						else {
							System.out.println("Input not accepted. Returning to Editing Menu.\n");
							break;
						}
					}
					break;
				}
			}
			if(isFound == true) {
				while(true) {
					System.out.println("Would you like to edit another record? Enter Y if so, or N if you are done.\n");
					String exitDecision = editScanner.nextLine().toUpperCase();
					if(exitDecision.equals("Y")) {
						System.out.println("Returning to record selection.\n");
						break;
					}
					else if(exitDecision.equals("N")) {
						decision = "";
						System.out.println("Returning to Menu.\n");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter input from list of accepted values.\n");
					}
				}
			}
			else {
				while(true) {
					System.out.println("Record: " + name + " not found. Would you like to edit another record? Enter Y if so, or N if you are done.\n");
					String exitDecision = editScanner.nextLine().toUpperCase();
					if(exitDecision.equals("Y")) {
						System.out.println("Returning to record selection.\n");
						break;
					}
					else if(exitDecision.equals("N")) {
						decision = "";
						System.out.println("Returning to Menu.\n");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter input from list of accepted values.\n");
					}
				}
			}
			
		}
		
		return;
	}
	/**
	 * Allows user to delete members
	 * @param members is the array that holds all of the members
	 */
	private static void deleteMember(ArrayList<Member> members) {
		Scanner deleteScanner = new Scanner(System.in);
		Boolean isFound = false;
		String decision = "C";
		String name = "";
		while(decision.equals("C")) {
			System.out.println("Please enter the name of the member you would like to delete.\n");
			name = deleteScanner.nextLine();
			for(int i = 0; i < members.size(); i++) {
				if(members.get(i).getpersonName().equals(name)) {
					isFound = true;
					System.out.println("Record found:\n");
					System.out.println("Name: " + name + "\n");
					System.out.println("Address: " + members.get(i).getpersonAddress() + "\n");
					System.out.println("City: " + members.get(i).getpersonCity() + "\n");
					System.out.println("State: " + members.get(i).getpersonState() + "\n");
					System.out.println("Zip Code: " + members.get(i).getpersonZip() + "\n");
					System.out.println("Member Number: " + members.get(i).getmemberNum() + "\n");
					System.out.println("Status: " + members.get(i).getmemberStatus() + "\n\n");
					while(true) {
						System.out.println("Would you like to delete this record? Type Y if so and N if not.\n");
						String deleteDecision = deleteScanner.nextLine().toUpperCase();
						if(deleteDecision.equals("Y")) {
							members.remove(i);
							System.out.println("Record removed.\n");
							break;
						}
						else if(deleteDecision.equals("N")) {
							System.out.println("Record preserved.\n");
							break;
						}
						else {
							System.out.println("Input not accepted, please enter input from list of accepted values.\n");
						}
					}
					break;
				}
			}
			if(isFound) {
				while(true) {
					System.out.println("Would you like to delete another record? Enter Y if so, or N if you are done.\n");
					String exitDecision = deleteScanner.nextLine().toUpperCase();
					if(exitDecision.equals("Y")) {
						System.out.println("Returning to record selection.\n");
						break;
					}
					else if(exitDecision.equals("N")) {
						decision = "";
						System.out.println("Returning to Menu.\n");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter input from list of accepted values.\n");
					}
				}
			}
			else {
				while(true) {
					System.out.println("Record: " + name + " not found. Would you like to delete another record? Enter Y if so, or N if you are done.\n");
					String exitDecision = deleteScanner.nextLine().toUpperCase();
					if(exitDecision.equals("Y")) {
						System.out.println("Returning to record selection.\n");
						break;
					}
					else if(exitDecision.equals("N")) {
						decision = "";
						System.out.println("Returning to Menu.\n");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter input from list of accepted values.\n");
					}
				}
			}
		}
		
		return;
	}
	/**
	 * Allows user to add/edit/delete providers
	 * @param providers is the array that holds all of the providers
	 */
	public static void editProvider(ArrayList<Provider> providers) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. To add a Provider, please enter 'A'.\n");
			System.out.println("2. To edit a Provider, please enter 'E'.\n");
			System.out.println("3. To delete a Provider, please enter 'D'.\n");
			System.out.println("4. If you are finished, please enter 'Q'.\n");
			String input = sc.nextLine().toUpperCase();
			if(input.equals("A")) {
				addProvider(providers);
			}
			else if(input.equals("E")){
				editingProvider(providers);
			}
			else if(input.equals("D")) {
				deleteProvider(providers);
			}
			else if(input.equals("Q")){
				System.out.println("Returning to Operator Menu\n");
				break;
			}
			else {
				System.out.println(input + "is not an accepted input. Please enter a valid input.\n");
			}
		}
		
		return;
	}
	/**
	 * Allows user to add providers
	 * @param providers is the array that holds all of the providers
	 */
	private static void addProvider(ArrayList<Provider> providers) {
		Scanner addScanner = new Scanner(System.in);
		String decision = "R";
		Provider newProvider = new Provider();
		while(decision.equals("R")) {
			System.out.println("Please enter the provider's name.\n");
			newProvider.setpersonName(addScanner.nextLine());
			System.out.println("Please enter the provider's address.\n");
			newProvider.setpersonAddress(addScanner.nextLine());
			System.out.println("Please enter the provider's city.\n");
			newProvider.setpersonCity(addScanner.nextLine());
			System.out.println("Please enter the provider's state.\n");
			newProvider.setpersonState(addScanner.nextLine());
			System.out.println("Please enter the provider's zip code.\n");
			newProvider.setpersonZip(addScanner.nextLine());
			System.out.println("Please enter the provider's number.\n");
			newProvider.setProviderNum(addScanner.nextLine());
			while(true) {
				System.out.println("Here is the new member:\n");
				System.out.println("Name: " + newProvider.getpersonName() + "\n");
				System.out.println("Address: " + newProvider.getpersonAddress() + "\n");
				System.out.println("City: " + newProvider.getpersonCity() + "\n");
				System.out.println("State: " + newProvider.getpersonState() + "\n");
				System.out.println("Zip Code: " + newProvider.getpersonZip() + "\n");
				System.out.println("Provider Number: " + newProvider.getProviderNum() + "\n");
				System.out.println("(Enter Y to save, N to discard, or R to change)\n");
				decision = addScanner.nextLine().toUpperCase();
				if(decision.equals("Y")) {
					providers.add(newProvider);
					System.out.println("Member added to database. Returning to menu.\n");
					break;
				}
				else if(decision.equals("N")) {
					System.out.println("New member discarded. Returning to menu.\n");
					break;
				}
				else if (decision.equals("R")) {
					System.out.println("Returning to make changes.\n");
					break;
				}
				else {
					System.out.println("Input not accepted, please enter an accepted input.\n");
				}
			}
			}
		
		return;
	}
	/**
	 * Allows user to edit providers
	 * @param providers is the array that holds all of the providers
	 */
	private static void editingProvider(ArrayList<Provider> providers) {
		Scanner editScanner = new Scanner(System.in);
		Boolean isFound = false;
		String decision = "C";
		String name = "";
		String change = "";
		while(decision.equals("C")) {
			System.out.println("Please enter the name of the provider you would like to edit.\n");
			name = editScanner.nextLine();
			for(int i = 0; i < providers.size(); i++) {
				if(providers.get(i).getpersonName().equals(name)) {
					isFound = true;
					System.out.println("Record found:\n");
					System.out.println("Name: " + name + "\n");
					System.out.println("Address: " + providers.get(i).getpersonAddress() + "\n");
					System.out.println("City: " + providers.get(i).getpersonCity() + "\n");
					System.out.println("State: " + providers.get(i).getpersonState() + "\n");
					System.out.println("Zip Code: " + providers.get(i).getpersonZip() + "\n");
					System.out.println("Provider Number: " + providers.get(i).getProviderNum() + "\n\n");
					while(true) {
						System.out.println("Please enter what you would like to change (Name, Address, City, etc.)\n");
						change = editScanner.nextLine().toUpperCase();
						if(change.equals("NAME")) {
							System.out.println("Current name: " + name + "\n");
							System.out.println("Please enter new name.\n");
							providers.get(i).setpersonName(editScanner.nextLine());
						}
						else if(change.equals("ADDRESS")) {
							System.out.println("Current address: " + providers.get(i).getpersonAddress() + "\n");
							System.out.println("Please enter new address.\n");
							providers.get(i).setpersonAddress(editScanner.nextLine());
						}
						else if(change.equals("CITY")) {
							System.out.println("Current city: " + providers.get(i).getpersonCity() + "\n");
							System.out.println("Please enter new city.\n");
							providers.get(i).setpersonCity(editScanner.nextLine());
						}
						else if(change.equals("STATE")) {
							System.out.println("Current state: " + providers.get(i).getpersonState() + "\n");
							System.out.println("Please enter new state.\n");
							providers.get(i).setpersonState(editScanner.nextLine());
						}
						else if(change.equals("ZIP CODE") || change.equals("ZIP")) {
							System.out.println("Current zip code: " + providers.get(i).getpersonZip() + "\n");
							System.out.println("Please enter new zip code.\n");
							providers.get(i).setpersonZip(editScanner.nextLine());
						}
						else if(change.equals("PROVIDER NUMBER") || change.equals("NUMBER")) {
							System.out.println("Current member number: " + providers.get(i).getProviderNum() + "\n");
							System.out.println("Please enter new member number.\n");
							providers.get(i).setProviderNum(editScanner.nextLine());
						}
						else {
							System.out.println("Input not accepted, please enter input from list of fields.\n");
						}
						System.out.println("Are you finished editing this provider? Enter Y if so, or enter N to continue editing.\n");
						String editDecision = editScanner.nextLine().toUpperCase();
						if(editDecision.equals("Y")) {
							System.out.println("Returning to Editing Menu.\n");
							break;
						}
						else if(editDecision.equals("N")) {
							System.out.println("Returning to continue editing.\n");
						}
						else {
							System.out.println("Input not accepted. Returning to Editing Menu.\n");
							break;
						}
					}
					break;
				}
			}
			if(isFound == true) {
				while(true) {
					System.out.println("Would you like to edit another record? Enter Y if so, or N if you are done.\n");
					String exitDecision = editScanner.nextLine().toUpperCase();
					if(exitDecision.equals("Y")) {
						System.out.println("Returning to record selection.\n");
						break;
					}
					else if(exitDecision.equals("N")) {
						decision = "";
						System.out.println("Returning to Menu.\n");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter input from list of accepted values.\n");
					}
				}
			}
			else {
				while(true) {
					System.out.println("Record: " + name + " not found. Would you like to edit another record? Enter Y if so, or N if you are done.\n");
					String exitDecision = editScanner.nextLine().toUpperCase();
					if(exitDecision.equals("Y")) {
						System.out.println("Returning to record selection.\n");
						break;
					}
					else if(exitDecision.equals("N")) {
						decision = "";
						System.out.println("Returning to Menu.\n");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter input from list of accepted values.\n");
					}
				}
			}
			
		}
		
		return;
	}
	/**
	 * Allows user to delete providers
	 * @param providers is the array that holds all of the providers
	 */
	private static void deleteProvider(ArrayList<Provider> providers) {
		Scanner deleteScanner = new Scanner(System.in);
		Boolean isFound = false;
		String decision = "C";
		String name = "";
		while(decision.equals("C")) {
			System.out.println("Please enter the name of the member you would like to delete.\n");
			name = deleteScanner.nextLine();
			for(int i = 0; i < providers.size(); i++) {
				if(providers.get(i).getpersonName().equals(name)) {
					isFound = true;
					System.out.println("Record found:\n");
					System.out.println("Name: " + name + "\n");
					System.out.println("Address: " + providers.get(i).getpersonAddress() + "\n");
					System.out.println("City: " + providers.get(i).getpersonCity() + "\n");
					System.out.println("State: " + providers.get(i).getpersonState() + "\n");
					System.out.println("Zip Code: " + providers.get(i).getpersonZip() + "\n");
					System.out.println("Provider Number: " + providers.get(i).getProviderNum() + "\n\n");
					while(true) {
						System.out.println("Would you like to delete this record? Type Y if so and N if not.\n");
						String deleteDecision = deleteScanner.nextLine().toUpperCase();
						if(deleteDecision.equals("Y")) {
							providers.remove(i);
							System.out.println("Record removed.\n");
							break;
						}
						else if(deleteDecision.equals("N")) {
							System.out.println("Record preserved.\n");
							break;
						}
						else {
							System.out.println("Input not accepted, please enter input from list of accepted values.\n");
						}
					}
					break;
				}
			}
			if(isFound) {
				while(true) {
					System.out.println("Would you like to delete another record? Enter Y if so, or N if you are done.\n");
					String exitDecision = deleteScanner.nextLine().toUpperCase();
					if(exitDecision.equals("Y")) {
						System.out.println("Returning to record selection.\n");
						break;
					}
					else if(exitDecision.equals("N")) {
						decision = "";
						System.out.println("Returning to Menu.\n");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter input from list of accepted values.\n");
					}
				}
			}
			else {
				while(true) {
					System.out.println("Record: " + name + " not found. Would you like to delete another record? Enter Y if so, or N if you are done.\n");
					String exitDecision = deleteScanner.nextLine().toUpperCase();
					if(exitDecision.equals("Y")) {
						System.out.println("Returning to record selection.\n");
						break;
					}
					else if(exitDecision.equals("N")) {
						decision = "";
						System.out.println("Returning to Menu.\n");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter input from list of accepted values.\n");
					}
				}
			}
		}
		return;
	}
}