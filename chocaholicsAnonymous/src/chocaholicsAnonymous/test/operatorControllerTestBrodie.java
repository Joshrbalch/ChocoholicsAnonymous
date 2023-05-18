package chocaholicsAnonymous.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import chocaholicsAnonymous.memberDatabase;
import chocaholicsAnonymous.operatorTerminal;
import chocaholicsAnonymous.providerDatabase;
import chocaholicsAnonymous.userDatabase;



class operatorControllerTestBrodie {
	providerDatabase providers;
	memberDatabase members;
	operatorTerminal opTerm;
	userDatabase userData;
	
	@BeforeEach
	void setUp() throws Exception {
		providers = new providerDatabase();
		opTerm = new operatorTerminal();
		userData = new userDatabase();
		members = new memberDatabase();
	}

	@Test
	void test1() {
		// Checks addStockMembers();
		assertEquals("Anita Dikinme", providers.getProviderList().get(0).getpersonName());
		assertEquals("123 Main Street", providers.getProviderList().get(0).getpersonAddress());
		assertEquals("Tuscaloosa", providers.getProviderList().get(0).getpersonCity());
		assertEquals("AL", providers.getProviderList().get(0).getpersonState());
		assertEquals("35401", providers.getProviderList().get(0).getpersonZip());
		assertEquals("1234567", providers.getProviderList().get(0).getProviderNum());
		
	}
	
	@Test
	void test2() {
		String userInput = "P" + "\nD" + "\nMike Oxlong" + "\nY" + "\nN" + "\nQ";
		System.setIn(new ByteArrayInputStream(userInput.getBytes()));
		assertEquals("Mike Oxlong", providers.getProviderList().get(1).getpersonName());
		assertEquals("456 1st Street", providers.getProviderList().get(1).getpersonAddress());
		assertEquals("Tuscaloosa", providers.getProviderList().get(1).getpersonCity());
		assertEquals("AL", providers.getProviderList().get(1).getpersonState());
		assertEquals("35401", providers.getProviderList().get(1).getpersonZip());
		assertEquals("8912030", providers.getProviderList().get(1).getProviderNum());
		providers.getProviderList().remove(1);
		assertEquals(2, providers.getProviderList().size());
		assertEquals("Barry Madikiner", providers.getProviderList().get(1).getpersonName());
		assertEquals("789 5th Avenue", providers.getProviderList().get(1).getpersonAddress());
		assertEquals("Tuscaloosa", providers.getProviderList().get(1).getpersonCity());
		assertEquals("AL", providers.getProviderList().get(1).getpersonState());
		assertEquals("35401", providers.getProviderList().get(1).getpersonZip());
		assertEquals("8912030", providers.getProviderList().get(1).getProviderNum());
		
	    
	      
	}
	
	@Test
	void test3() {
		String userInput = "M" + "\nD" + "\nHarold Pickles" + "\nY" + "\nN" + "\nQ";
		System.setIn(new ByteArrayInputStream(userInput.getBytes()));
		assertEquals("Harold Pickles", members.getMemberList().get(0).getpersonName());
		assertEquals("1831 Univ. Blvd.", members.getMemberList().get(0).getpersonAddress());
		assertEquals("Tuscaloosa", members.getMemberList().get(0).getpersonCity());
		assertEquals("Alabama", members.getMemberList().get(0).getpersonState());
		assertEquals("35487", members.getMemberList().get(0).getpersonZip());
		assertEquals("100", members.getMemberList().get(0).getmemberNum());
		assertEquals("Approved", members.getMemberList().get(0).getmemberStatus());
		members.getMemberList().remove(0);
		assertEquals("Hugh Janus", members.getMemberList().get(0).getpersonName());
		assertEquals("1451 Univ. Blvd.", members.getMemberList().get(0).getpersonAddress());
		assertEquals("Tuscaloosa", members.getMemberList().get(0).getpersonCity());
		assertEquals("Alabama", members.getMemberList().get(0).getpersonState());
		assertEquals("35487", members.getMemberList().get(0).getpersonZip());
		assertEquals("101", members.getMemberList().get(0).getmemberNum());
		assertEquals("Approved", members.getMemberList().get(0).getmemberStatus());
		members.getMemberList().get(0).setmemberNum("1000");
		assertEquals("Hugh Janus", members.getMemberList().get(0).getpersonName());
		assertEquals("1451 Univ. Blvd.", members.getMemberList().get(0).getpersonAddress());
		assertEquals("Tuscaloosa", members.getMemberList().get(0).getpersonCity());
		assertEquals("Alabama", members.getMemberList().get(0).getpersonState());
		assertEquals("35487", members.getMemberList().get(0).getpersonZip());
		assertEquals("1000", members.getMemberList().get(0).getmemberNum());
		assertEquals("Approved", members.getMemberList().get(0).getmemberStatus());
	}
	

}
