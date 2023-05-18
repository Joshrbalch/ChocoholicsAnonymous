package chocaholicsAnonymous.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chocaholicsAnonymous.Member;
import chocaholicsAnonymous.memberDatabase;
import chocaholicsAnonymous.providerDatabase;


class operatorControllerTestLiam {
	Member thismember;
	memberDatabase members;
	providerDatabase providers;
	@BeforeEach
	void setUp() throws Exception {
		thismember = new Member();
		members = new memberDatabase();
		providers = new providerDatabase();
		//addStockMembers();
	}

	@Test
	void test() {
		
		thismember.setpersonName("Bob Jones");
		assertEquals("Bob Jones", thismember.getpersonName());
		
		assertEquals("Harold Pickles", members.getMemberList().get(0).getpersonName());
		assertEquals("Tuscaloosa", members.getMemberList().get(0).getpersonCity());
		assertEquals("Alabama", members.getMemberList().get(0).getpersonState());
		assertEquals("100", members.getMemberList().get(0).getmemberNum());
		
		assertEquals("Anita Dikinme", providers.getProviderList().get(0).getpersonName());
		assertEquals("Tuscaloosa", providers.getProviderList().get(0).getpersonCity());
		assertEquals("AL", providers.getProviderList().get(0).getpersonState());
		assertEquals("1234567", providers.getProviderList().get(0).getProviderNum());
		
		


}
}
