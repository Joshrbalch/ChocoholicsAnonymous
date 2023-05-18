package chocaholicsAnonymous;
/**
*The Provider class holds all the information specific to provider as well as accessing
*information from the Person class
*
* @author Brodye Stevens
* @version 1.0
*/
public class Provider extends Person{
	private String providerNum;
	
	public String getProviderNum() {
		return providerNum;
	}
	
	public void setProviderNum(String provNum) {
		this.providerNum = provNum;
	}
};
