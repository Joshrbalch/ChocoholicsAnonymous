package chocaholicsAnonymous.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chocaholicsAnonymous.memberDatabase;
import chocaholicsAnonymous.providerController;
import chocaholicsAnonymous.providerDirectory;

class providerControllerTestKatie {
	providerDirectory providerBook;
	memberDatabase members;
	
	@BeforeEach
	void setUp() throws Exception {
		providerBook = new providerDirectory();
		members = new memberDatabase();
	}

	@Test
	void test1() {
		//checks stock directory
		assertEquals(598470,providerBook.getDirectory().get(0).getServiceCode());//service number
		assertEquals("Dietician", providerBook.getDirectory().get(0).getServiceName());//service name
	}
	@Test
	void test2() {
		//member verification
		//need number
		//return valid
		assertEquals("Valid", providerController.validateMember("100"));
	}
	@Test
	void test3() {
		//testing a method I did not write
		//checking stock members for member database
		assertEquals("Hugh Janus",members.getMemberList().get(1).getpersonName());
		assertEquals("1451 Univ. Blvd.",members.getMemberList().get(1).getpersonAddress());
		assertEquals("Tuscaloosa",members.getMemberList().get(1).getpersonCity());
		assertEquals("Alabama",members.getMemberList().get(1).getpersonState());
		assertEquals("35487",members.getMemberList().get(1).getpersonZip());
		assertEquals("101",members.getMemberList().get(1).getmemberNum());
		assertEquals("Approved",members.getMemberList().get(1).getmemberStatus());
		
	}
}