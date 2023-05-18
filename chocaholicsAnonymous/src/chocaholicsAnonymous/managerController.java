package chocaholicsAnonymous;
/**
* The managerController holds the methods for the manager to request to generate the reports
*
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class managerController {
	/**
	 * creates and writes a provider report 
	 */
    void requestProviderReport() {
        providerReport providerReport = new providerReport();
        providerReport.generateProviderReport();
    }
    /**
     * creates and generates a etf report
     */
    void requestETFReport() {
        ETFReport etfReport = new ETFReport();
        etfReport.generateETFReport();
    }
    /**
     * creates and generates a member report
     */
    void requestMemberReport() {
        memberReport memberReport = new memberReport();
        memberReport.generateMemberReport();
    }
    /**
     * creates and generates a manager report
     */
    void requestManagerReport() {
        managerReport managerReport = new managerReport();
        managerReport.generateManagerReport();
    }
  
    void requestTotalReport() {
    }

}