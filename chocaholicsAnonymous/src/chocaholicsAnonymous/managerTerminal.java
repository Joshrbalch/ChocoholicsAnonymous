package chocaholicsAnonymous;

import java.util.*;
/**
* The managerTerminal class is the terminal for used by managers to view and handle reports
*
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class managerTerminal {
	/**
	 * Opens a new terminal and displays menu
	 */
    public static void main() {
        managerTerminal terminal = new managerTerminal();
        terminal.displayMenu();
    }
    /**
     * Displays the types of reports and allows user to select which report they would like to generate
     */
    public void displayReportOptions() {
        String input = "";
        Scanner sc1 = new Scanner(System.in);

        while(true) {
            System.out.println("1. Member report");
            System.out.println("2. Provider report");
            System.out.println("3. EFT report");
            System.out.println("4. Main Accounting Procedure");
            System.out.println("5. Logout");
            System.out.println("\n");

            input = sc1.nextLine();

            if (input.equals("1")) {
                memberReport report = new memberReport();
                report.generateMemberReport();
            }

            else if (input.equals("2")) {
                providerReport report = new providerReport();
                report.generateProviderReport();
            }

            else if (input.equals("3")) {
                ETFReport report = new ETFReport();
                report.generateETFReport();
            }

            else if (input.equals("4")) {
                mainAccountingProcedure report = new mainAccountingProcedure();
                report.generateReport();
            }

            else if (input.equals("5")) {
                logout();
                break;
            }

            else {
                System.out.println("Invalid input");
                displayReportOptions();
            }
        }

    }

    public void displayName() {
    }
    /**
     * Displays the menu to view a report or to log out
     */
    public void displayMenu() {
        String input = "";
        Scanner sc1 = new Scanner(System.in);

        while(true) {
            System.out.println("1. View report");
            System.out.println("2. Logout");

            input = sc1.nextLine();

            if (input.equals("1")) {
                displayReportOptions();
            } else if (input.equals("2")) {
                logout();
                break;
            } else {
                System.out.println("Invalid input");
                displayMenu();
            }
        }
    }
    /**
     * Allows user to logout
     */
    public void logout() {
        System.out.println("Thank you for choosing Chocaholics Anonymous!");
		return;
    }
}