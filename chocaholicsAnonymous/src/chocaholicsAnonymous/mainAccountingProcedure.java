package chocaholicsAnonymous;
/**
* The mainAccountingProcedure is the procedure that the timer would execute once a week, generating and distributing reports
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class mainAccountingProcedure{
	providerReport providerReport;
    ETFReport etfReport;
    memberReport memberReport;
    managerReport managerReport;

    void generateReport() {
        providerReport = new providerReport();
        etfReport = new ETFReport();
        memberReport = new memberReport();
        managerReport = new managerReport();
        
        providerReport.generateProviderReport();
        etfReport.generateETFReport();
        memberReport.generateMemberReport();
        managerReport.generateManagerReport();
    }

    void distributeReport() {}
}