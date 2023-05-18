package chocaholicsAnonymous;
/**
* The Person class holds all of the information that could be both applied to 
* members and providers
*
* @author Liam Kelly
* @version 1.0
*/
public class Person {
	//may need to be public to access outside of class
	private String personName;
	private String personAddress;
	private String personCity;
	private String personState;
	private String personZip;
	
	  // Getter for personName
	  public String getpersonName() {
	    return personName;
	  }

	  // Setter for personName
	  public void setpersonName(String newpersonName) {
	    this.personName = newpersonName;
	  }
	  
	  // Getter for personAddress
	  public String getpersonAddress() {
	    return personAddress;
	  }

	  // Setter for personAddress
	  public void setpersonAddress(String newpersonAddress) {
	    this.personAddress = newpersonAddress;
	  }
	  
	  // Getter for personCity
	  public String getpersonCity() {
	    return personCity;
	  }

	  // Setter for personCity
	  public void setpersonCity(String newpersonCity) {
	    this.personCity = newpersonCity;
	  }

	  // Getter for personState
	  public String getpersonState() {
	    return personState;
	  }

	  // Setter for personState
	  public void setpersonState(String newpersonState) {
	    this.personState = newpersonState;
	  }
	  
	  // Getter for personZip
	  public String getpersonZip() {
	    return personZip;
	  }

	  // Setter for personState
	  public void setpersonZip(String newpersonZip) {
	    this.personZip = newpersonZip;
	  }

}
