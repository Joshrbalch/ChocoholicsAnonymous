package chocaholicsAnonymous;
/**
* The memberServiceReport class holds information about the appointment with a provider
*
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class memberServiceReport{
	Date LocalDate;
    String memberName;
    String memberNum;

    memberServiceReport() {
        LocalDate = new Date();
        memberName = "";
        memberNum = "";
    }

    public void generateMemberServiceReport() {
        System.out.println("Date of service: " + LocalDate);
        System.out.println("Provider Name: " + memberName);
        System.out.println("Member Number: " + memberNum);
    }
}