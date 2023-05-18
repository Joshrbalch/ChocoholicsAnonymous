package chocaholicsAnonymous;
/**
* The providerReport class builds and generates the report sent to the provider with all of the information about appointments 
* with members
*
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class providerReport{
	String providerName;
    String providerNum;
    String providerAddress;
    String providerCity;
    String providerState;
    String providerZip;
    serviceReport serviceReport;
    int consultationNum;
    double totalFee;

    public providerReport() {
        providerName = "Anita Dikinme";
        providerNum = "123456789";
        providerAddress = "69 Hellen Keller Blvd";
        providerCity = "Tuscaloosa";
        providerState = "AL";
        providerZip = "35404";
        serviceReport = new serviceReport();
        consultationNum = 001;
        totalFee = 10;
    }

    public void generateProviderReport() {
        System.out.println("Provider Name: " + providerName);
        System.out.println("Provider Number: " + providerNum);
        System.out.println("Provider Street Address: " + providerAddress);
        System.out.println("Provider City: " + providerCity);
        System.out.println("Provider State: " + providerState);
        System.out.println("Provider Zip: " + providerZip);
        generateServiceReport();
        System.out.println("Number of Consultations: " + consultationNum);
        System.out.println("Total fee for week: " + totalFee);
    }

    public void generateServiceReport() {
        serviceReport.print();
    }
    
    public String returnName() {
    	return providerName;
    }
    
    public String returnProviderNum() {
    	return providerNum;
    }
    
    public String returnAddress() {
    	return providerAddress;
    }
    
    public String returnCity() {
    	return providerCity;
    }
    
    public String returnState() {
    	return providerState;
    }
    
    public String returnZip() {
    	return providerZip;
    }
    
    public int returnConNum() {
    	return consultationNum;
    }
    
    public double returnFee() {
    	return totalFee;
    }
}