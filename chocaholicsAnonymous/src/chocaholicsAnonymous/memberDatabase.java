package chocaholicsAnonymous;
import java.util.ArrayList;
/**
* The memberDatabase is a database for members to create the array to hold all members
*
* @author Liam Kelly
* @version 1.0
*/
public class memberDatabase{
	private ArrayList<Member> members;
	
	public memberDatabase(){
		members = new ArrayList<Member>();
		addStockMembers();
	}
	
	public ArrayList<Member> getMemberList(){
		return members;
	}
	
	private void addStockMembers() {
		Member stockOne = new Member();
				stockOne.setpersonName("Harold Pickles");
				stockOne.setpersonAddress("1831 Univ. Blvd.");
				stockOne.setpersonCity("Tuscaloosa");
				stockOne.setpersonState("Alabama");
				stockOne.setpersonZip("35487");
				stockOne.setmemberNum("100");
				stockOne.setmemberStatus("Approved");
				members.add(stockOne);
		Member stockTwo = new Member();
				stockTwo.setpersonName("Hugh Janus");
				stockTwo.setpersonAddress("1451 Univ. Blvd.");
				stockTwo.setpersonCity("Tuscaloosa");
				stockTwo.setpersonState("Alabama");
				stockTwo.setpersonZip("35487");
				stockTwo.setmemberNum("101");
				stockTwo.setmemberStatus("Approved");
				members.add(stockTwo);
		Member stockThree = new Member();
				stockThree.setpersonName("Jenny Tolls");
				stockThree.setpersonAddress("1204 Univ. Blvd.");
				stockThree.setpersonCity("Tuscaloosa");
				stockThree.setpersonState("Alabama");
				stockThree.setpersonZip("35487");
				stockThree.setmemberNum("102");
				stockThree.setmemberStatus("Approved");
				members.add(stockThree);
				
	}
}