
package chocaholicsAnonymous;
/**
* The providerDirectoryInfo class holds all of the basic getting and setting functions to add or pull services from the provider directory
* database for specific services. 
*
* @author Katie Heath
* @version 1.0
*/
public class providerDirectoryInfo  {
    private int serviceCode;
    private String serviceName;
    
    public int getServiceCode() {
    	return serviceCode;
    }
    
    public void setServiceCode(int servCode) {
    	this.serviceCode = servCode;
    }
    
    public String getServiceName() {
    	return serviceName;
    }
    
    public void setServiceName(String servName) {
    	this.serviceName = servName;
    }
    
    
}