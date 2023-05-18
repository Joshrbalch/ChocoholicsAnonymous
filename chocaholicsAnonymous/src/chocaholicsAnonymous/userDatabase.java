package chocaholicsAnonymous;

import java.util.*;
import java.util.ArrayList;
/**
* The userDatabase class holds informations about users and adds stock users to the array to begin with
*
* @author Michael Orscheln
* @version 1.0
*/
public class userDatabase extends User {
    ArrayList<User> users;

    public userDatabase() {
        users = new ArrayList<User>();
        addStockUsers();
    }

    private void addStockUsers() {
        User stockUser1 = new User();
        stockUser1.setUserFirstName("Liam");
        stockUser1.setUserLastName("Neeson");
        stockUser1.setUserJobTitle("Operator");
        stockUser1.setUserUsername(("liamneeson"));
        stockUser1.setUserPassword("whereisshe");
        users.add(stockUser1);

        User stockUser2 = new User();
        stockUser2.setUserFirstName("Jake");
        stockUser2.setUserLastName("Paul");
        stockUser2.setUserJobTitle("Manager");
        stockUser2.setUserUsername(("jakepaul"));
        stockUser2.setUserPassword("team10");
        users.add(stockUser2);

        User stockUser3 = new User();
        stockUser3.setUserFirstName("Patrick");
        stockUser3.setUserLastName("Bateman");
        stockUser3.setUserJobTitle("Provider");
        stockUser3.setUserUsername(("patrickbateman"));
        stockUser3.setUserPassword("americanpsycho");
        users.add(stockUser3);
    }

    public ArrayList<User> getUserList() {
        return users;
    }
}
