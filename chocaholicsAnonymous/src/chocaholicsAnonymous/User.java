package chocaholicsAnonymous;

import java.util.*;
/**
* The User class that holds all information about users and setting and returning the information about users
*
* @author Michael Orscheln
* @version 1.0
*/
public class User {
    private String userFirstName;
    private String userLastName;
    private String userJobTitle;
    private String userUsername;
    private String userPassword;

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserJobTitle() {
        return userJobTitle;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserFirstName(String newUserFirstName) {
        this.userFirstName = newUserFirstName;
    }

    public void setUserLastName(String newUserLastName) {
        this.userLastName = newUserLastName;
    }

    public void setUserJobTitle(String newUserJobTitle) {
        this.userJobTitle = newUserJobTitle;
    }

    public void setUserUsername(String newUserUsername) {
        this.userUsername = newUserUsername;
    }

    public void setUserPassword(String newUserPassword) {
        this.userPassword = newUserPassword;
    }
}
