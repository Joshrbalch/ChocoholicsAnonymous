package chocaholicsAnonymous;
import java.util.*;
/**
*  The providerController class runs the bill for service, request provider directory validate member and confirm service methods
*
* @author Katie Heath
* @version 1.0
*/
public class providerController {
	/**
	 * this is the requesting of the provider directory to be sent to your email
	 */
	public static void lookupProviderDirectory() {
		System.out.println("Provider Directory has now been sent to E-Mail on file.");
		return;
	}
	/**
	 * bill for service will ask for a member number, then will validate the member, ask for a service code and then will confirm the service
	 * 
	 * @return completed is the boolean return from confirm service to see if everything finished correctly in that function, should return true if user didn't quit 
	 * while confirming service
	 */
	public static void billForService(ArrayList<serviceRecordInfo> serviceRecords){
		String memberNum="";
		String serviceCode="";
		String memStatus="";
		Boolean completed=false;
		int serviceCodeNum =0;
		//use scanner to get member number
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Member Number.");
		memberNum=sc1.nextLine();
		// go through member validation
		memStatus = validateMember(memberNum);
		if (memStatus.equals("Invalid")) {
			System.out.println("Cannot Validate Member. Returning to Menu.");
			return;
		}
		Scanner sc2 = new Scanner(System.in);
		// scanner for service code
		System.out.println("Enter Service Code");
		// confirm service
		serviceCode = sc2.nextLine();
		serviceCodeNum = confirmService(serviceCode);
		// save to disk--------- are we just going to print out what the report says?
		 completed = addService(serviceRecords,memberNum,serviceCodeNum);
		return;
	}
	/**
	 * Adding a service to a disk after billing. 
	 * @param serviceRecords the list of the records
	 * @param member member number
	 * @param code service code
	 * @return completed is the note if it was saved or not. 
	 */
	public static Boolean addService(ArrayList<serviceRecordInfo> serviceRecords,String member, int code) {
		Boolean completed=false;
		int memberNum = Integer.parseInt(member);
		int serviceCode = code;
		Date apptDate = new Date();
		Date dateEntered = new Date();
		int providerNum =0;
		String comments="";
		int month=0;
		int day=0;
		int year=0;
		serviceRecordInfo record= new serviceRecordInfo();
		String answer="";
		String keeper="R";
		while(keeper.equals("R")) {
			System.out.println("Save Record? Enter 'Yes' or 'No'.");
			Scanner sc = new Scanner(System.in);
			answer = sc.nextLine();
			if(answer.equals("Yes")) {
				System.out.println("Enter Date of Appointment.");
				System.out.println("Enter Month of Appointment.");
				answer = sc.nextLine();
				month = Integer.parseInt(answer);
				System.out.println("Enter Day of Appointment.");
				answer = sc.nextLine();
				day = Integer.parseInt(answer);
				System.out.println("Enter Year of Appointment.");
				answer = sc.nextLine();
				year = Integer.parseInt(answer);
				apptDate.setDate(month,day,year);
				System.out.println("Enter Today's Date.");
				System.out.println("Enter Month.");
				answer = sc.nextLine();
				month = Integer.parseInt(answer);
				System.out.println("Enter Day.");
				answer = sc.nextLine();
				day = Integer.parseInt(answer);
				System.out.println("Enter Year.");
				answer = sc.nextLine();
				year = Integer.parseInt(answer);
				dateEntered.setDate(month,day,year);
				System.out.println("Enter provider number.");
				answer = sc.nextLine();
				providerNum = Integer.parseInt(answer);
				System.out.println("Enter comments.");
				comments = sc.nextLine();
				record.setLocalDateTime(dateEntered);
				record.setLocalDate(apptDate);
				record.setMemberNumber(memberNum);
				record.setProviderNumber(providerNum);
				record.setServiceCode(serviceCode);
				record.setComments(comments);
				while(true) {
					System.out.println("Record Entered Date: "+ record.getLocalDateTime().getMonth()+"/"+record.getLocalDateTime().getDay()+"/"+record.getLocalDateTime().getYear());
					System.out.println("Appointment Date: "+ record.getLocalDate().getMonth()+"/"+record.getLocalDate().getDay()+"/"+record.getLocalDate().getYear());
					System.out.println("Provider Number: "+ record.getProviderNumber());
					System.out.println("Member Number: "+ record.getMemberNumber());
					System.out.println("Service Code: "+ record.getServiceCode());
					System.out.println("Comments: "+ record.getComments());
					System.out.println("(Enter 'Y' to save, 'N' to cancel, 'R' to edit");
					keeper = sc.nextLine();
					if(keeper.equals("Y")) {
						serviceRecords.add(record);
						completed=true;
						System.out.println("Record added. Returning to Main Provider Menu;");
						break;
					}
					else if(keeper.equals("N")) {
						System.out.println("Record not saved. Returning to Main Provider Menu");
						break;
					}
					else if(keeper.equals("R")) {
						System.out.println("Returning to make changes.");
						break;
					}
					else {
						System.out.println("Input not accepted, please enter an accepted input.");
					}
				}
			}
			else if(answer.equals("No")){
				break;
			}
			else {
				continue;
			}
		}
		
		return completed;
	}
	/**
	 * Validate member will see if the member number is valid in the member database
	 * @param number is the member id number
	 * @return the member status to display during billForService, either "Valid"  or "Invalid"
	 */
	public static String validateMember(String number){
		Boolean isFound=false;
		String status="";
		String displayStatus="";
		memberDatabase memberData= new memberDatabase();
		ArrayList<Member> members = memberData.getMemberList();
		// go through array list and find correct member
		while(true){
			for (int i = 0; i < members.size(); i++) { 
				if (members.get(i).getmemberNum().equals(number)) {
					System.out.println("Member Name: "+members.get(i).getpersonName());
					isFound = true;
					System.out.println("Member Found");
					status=members.get(i).getmemberStatus();
					if(status.equals("Approved")) {
						displayStatus="Valid";
					}
					else {
						displayStatus="Invalid";
						System.out.println("Inalid.");
					}
					break;
				}
			}
			if(isFound==false){
				System.out.println("No Member Found.");
				System.out.println("Enter Member Number or press 'C' to cancel");
				Scanner sc= new Scanner(System.in);
				number = sc.nextLine();;
				if(number.equals("C")){
					return number;
				}
			}
			else{
				break;
			}
		}
			//how do we want to display how much is owed if it is suspended
		return displayStatus;
	}
	/**
	 * This goes through confirming the service by displaying the name attached to the code and asking the user if it is correct
	 * @param serviceCodeS is the service code in string form
	 * @return a boolean value to see if the code was the correct code for the name.
	 */
	private static int confirmService(String serviceCodeS){
		int serviceCode = Integer.parseInt(serviceCodeS);
		String serviceName="";
		String codeStatus="";
		Boolean isFound=false;
		providerDirectory directoryBook=new providerDirectory();
		ArrayList<providerDirectoryInfo> directory = directoryBook.getDirectory();
		// go through provider directory array and find service code
		while (true) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < directory.size(); i++) {
				if (directory.get(i).getServiceCode() == serviceCode) {
					serviceName = directory.get(i).getServiceName();
					isFound = true;
					break;
				}
			}
			if (isFound == true) {
				// if service code is found display name
				System.out.println("Service Code: " + serviceCode);
				System.out.println("Service Name: " + serviceName);
				System.out.println("Is this correct? Enter 'Yes' or 'No'");
				codeStatus= sc.nextLine();
				if(codeStatus.equals("Yes")) {
					break;
				} else if(codeStatus.equals("No")){
					System.out.println("Enter new code.");
					serviceCodeS=sc.nextLine();
					serviceCode = Integer.parseInt(serviceCodeS);
				}
			} else {
				// if service code is not found display error
				System.out.println("Code not found.");
				System.out.println("Enter new code.");
				serviceCodeS=sc.nextLine();
				serviceCode = Integer.parseInt(serviceCodeS);
			}
		}
		return serviceCode;
	}
}