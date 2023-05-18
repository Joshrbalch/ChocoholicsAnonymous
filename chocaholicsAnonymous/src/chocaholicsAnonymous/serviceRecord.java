
package chocaholicsAnonymous;
import java.util.ArrayList;

/**
* The serviceRecord class holds the array of all records done by provider
*
* @author Katie Heath
* @version 1.0
*/
public class serviceRecord {
   ArrayList<serviceRecordInfo> serviceRecord;
   
   public serviceRecord() {
	   serviceRecord = new ArrayList<serviceRecordInfo>();
	   addStockRecords();
   }
   
   public ArrayList<serviceRecordInfo> getServiceRecords(){
	   return serviceRecord;
   }
   
   public void addStockRecords() {
	   serviceRecordInfo record1= new serviceRecordInfo();
	   Date date1=new Date();
	   Date date2= new Date();
	   date1.setDate(4, 2, 2023);
	   date2.setDate(3, 13, 2023);
	   record1.setLocalDateTime(date1);
	   record1.setLocalDate(date2);
	   record1.setProviderNumber(8874632);
	   record1.setMemberNumber(100);
	   record1.setServiceCode(598470);
	   record1.setComments("Patient is doing well.");
	   serviceRecordInfo record2= new serviceRecordInfo();
	   date1.setDate(3, 2, 2023);
	   date2.setDate(2, 13, 2023);
	   record2.setLocalDateTime(date1);
	   record2.setLocalDate(date2);
	   record2.setProviderNumber(8874632);
	   record2.setMemberNumber(101);
	   record2.setServiceCode(883948);
	   record2.setComments("Patient really struggled today.");
   }
}