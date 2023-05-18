package chocaholicsAnonymous;

import java.util.*;
/**
* The userVerification class is used when logging in user by checking user name and password and then directing 
* the user to the correct terminal.
*
* @author Michael Orscheln
* @version 1.0
*/
public class userVerification {
    // private Boolean userIsVerified;
    // private String jobTitle;
    // private String username;
    // private String password;
    private User curUser;
    public Boolean isVerified;
    /**
     * Verifies that the user is in the user database and has the correct user name and password combination
     * @param username the user's user name
     * @param password the user's password
     */
    public void verify(String username, String password) {
        userDatabase userData = new userDatabase();
        ArrayList<User> users = userData.getUserList();

        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getUserUsername().equals(username))
                    && (users.get(i).getUserPassword().equals(password))) {
                // userIsVerified = true;
                // return userIsVerified;
                curUser = users.get(i);
                isVerified = true;

                directToTerminal(true, curUser.getUserJobTitle());
                return;
            }
        }
        System.out.println("User not verified.");
        mainTerminal backToMainTerminal = new mainTerminal();
        backToMainTerminal.displayLogin();
        // return false;
    }
    /**
     * goes to the correct terminal based on job title
     * @param Verification if the user was able to login correctly
     * @param userJob what the user's job was and which terminal to direct the user to
     */
    public void directToTerminal(Boolean Verification, String userJob) {
        isVerified = Verification;
        if (isVerified == true) {

            if (userJob == "Operator") {
                operatorTerminal opTerminal = new operatorTerminal();
                opTerminal.displayMenu();
            } else if (userJob == "Manager") {
                managerTerminal manTerminal = new managerTerminal();
                manTerminal.displayMenu();
            } else if (userJob == "Provider") {
                providerTerminal provTerminal = new providerTerminal();
                provTerminal.displayMenu();
            }
        } else {
            mainTerminal backToMain = new mainTerminal();
            backToMain.displayLogin();
        }
    }

}