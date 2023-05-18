package chocaholicsAnonymous;
/**
* The serviceReport class builds and holds all information about an appointment with a provider to be used in the provider report
*
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class serviceReport{
	Date dateOfService;
    Date localDateTime;
    String memberName;
    int memberNum;
    int serviceCode;
    double feeToBePaid;

    serviceReport() {
        dateOfService = new Date();
        localDateTime = new Date();
        memberName = "Barack Obama";
        memberNum = 101010101;
        serviceCode = 12345;
        feeToBePaid = 10.0;
    }

    public void setDateOfService(Date date) {
        dateOfService = date;
    }

    public void setLocalDateTime(Date date) {
        localDateTime = date;
    }

    public void setMemberName(String name) {
        memberName = name;
    }

    public void setMemberNum(int num) {
        memberNum = num;
    }

    public void setServiceCode(int code) {
        serviceCode = code;
    }

    public void setFeeToBePaid(double fee) {
        feeToBePaid = fee;
    }

    public void print() {
        System.out.println("Date of Service: " + dateOfService.month + "/" + dateOfService.day + "/" + dateOfService.year);
        System.out.println("Date and Time Received: " + localDateTime.month + "/" + localDateTime.day + "/" + localDateTime.year);
        System.out.println("Member Name: " + memberName);
        System.out.println("Member Number: " + memberNum);
        System.out.println("Service Code: " + serviceCode);
        System.out.println("Fee to be Paid: " + feeToBePaid);
        System.out.println("\n");
    }
    
    public Date returnDateOfService() {
    	return dateOfService;
    }
    
    public Date returnLocalDate() {
    	return localDateTime;
    }
    
    public String returnMemName() {
    	return memberName;
    }
    
    public int returnMemNum() {
    	return memberNum;
    }
    
    public int returnServiceCode() {
    	return serviceCode;
    }
    
    public double returnFee() {
    	return feeToBePaid;
    }
}