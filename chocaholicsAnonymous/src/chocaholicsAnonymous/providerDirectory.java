
package chocaholicsAnonymous;
import java.util.ArrayList;
/**
* The providerDirectory class is what creates the array of the info created in providerDirectoryInfo, as well 
*  as adds a few stock services to the directory
*
* @author Katie Heath
* @version 1.0
*/
public class providerDirectory  {
    ArrayList<providerDirectoryInfo> directory;
    
    public providerDirectory(){ 
    	directory = new ArrayList<providerDirectoryInfo>();
    	addStockDirectory();
    }
	public ArrayList<providerDirectoryInfo> getDirectory(){
		return directory;
	}
    
    private void addStockDirectory() {
    	providerDirectoryInfo service1 = new providerDirectoryInfo();
    	service1.setServiceCode(598470);
    	service1.setServiceName("Dietician");
    	directory.add(service1);
    	providerDirectoryInfo service2 = new providerDirectoryInfo();
    	service2.setServiceCode(883948);
    	service2.setServiceName("Aerobics Exercise Session");
    	directory.add(service2);
    }
    
}