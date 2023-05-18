package chocaholicsAnonymous;
import java.util.ArrayList;
/**
* The providerDatabase class is a database for providers to create the array to hold all providers as well as adding stock providers
*
* @author Brodye Stevens
* @version 1.0
*/
public class providerDatabase{
	ArrayList<Provider> providers;
	
	public providerDatabase(){
		providers = new ArrayList<Provider>();
		addStockProviders();
	}
	
	private void addStockProviders() {
		Provider stockProvider1 = new Provider();
		stockProvider1.setpersonName("Anita Dikinme");
		stockProvider1.setpersonAddress("123 Main Street");
		stockProvider1.setpersonCity("Tuscaloosa");
		stockProvider1.setpersonState("AL");
		stockProvider1.setpersonZip("35401");
		stockProvider1.setProviderNum("1234567");
		providers.add(stockProvider1);
		Provider stockProvider2 = new Provider();
		stockProvider2.setpersonName("Mike Oxlong");
		stockProvider2.setpersonAddress("456 1st Street");
		stockProvider2.setpersonCity("Tuscaloosa");
		stockProvider2.setpersonState("AL");
		stockProvider2.setpersonZip("35401");
		stockProvider2.setProviderNum("8912030");
		providers.add(stockProvider2);
		Provider stockProvider3 = new Provider();
		stockProvider3.setpersonName("Barry Madikiner");
		stockProvider3.setpersonAddress("789 5th Avenue");
		stockProvider3.setpersonCity("Tuscaloosa");
		stockProvider3.setpersonState("AL");
		stockProvider3.setpersonZip("35401");
		stockProvider3.setProviderNum("8912030");
		providers.add(stockProvider3);
		Provider stockProvider4 = new Provider();
		stockProvider4.setpersonName("Patrick Bateman");
		stockProvider4.setpersonAddress("623 12th Street");
		stockProvider4.setpersonCity("Tuscaloosa");
		stockProvider4.setpersonState("AL");
		stockProvider4.setpersonZip("35401");
		stockProvider4.setProviderNum("8874632");
		providers.add(stockProvider4);
	}
	
	public ArrayList<Provider> getProviderList(){
		return providers;
	}
}