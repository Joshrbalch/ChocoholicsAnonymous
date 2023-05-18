package chocaholicsAnonymous;

import java.util.*;
/**
* The class memberReport would generate the report that would be sent to a member.
*
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class memberReport extends managerTerminal {
    String memberName;
    String memberNum;
    String memberAddress;
    String memberCity;
    String memberState;
    String memberZip;
    memberServiceReport memberServiceReport;

    memberReport() {
        memberName = "Josh Balch";
        memberNum = "78";
        memberAddress = "301 Hellen Keller Blvd";
        memberCity = "Tuscaloosa";
        memberState = "AL";
        memberZip = "35404";
        memberServiceReport = new memberServiceReport();
    }

    public void generateMemberReport() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member Number: " + memberNum);
        System.out.println("Member Street Address: " + memberAddress);
        System.out.println("Member City: " + memberCity);
        System.out.println("Member State: " + memberState);
        System.out.println("Member Zip: " + memberZip);
    }

    public void generateMemberServiceReport() {
        memberServiceReport.generateMemberServiceReport();
    }
}