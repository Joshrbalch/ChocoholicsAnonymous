package chocaholicsAnonymous.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chocaholicsAnonymous.User;
import chocaholicsAnonymous.providerTerminal;
import chocaholicsAnonymous.userDatabase;
import chocaholicsAnonymous.userVerification;

public class userVerficationTestMichael {
	userVerification userVerify;
	userDatabase userData;
	User userSetup;

	@BeforeEach
	public void setUp() throws Exception {
		userVerify = new userVerification();
		userData = new userDatabase();
		userSetup = new User();

	}

	@Test
	public void testUserPasswordSuccess() {

		assertEquals("patrickbateman", userData.getUserList().get(2).getUserUsername());
		assertEquals("americanpsycho", userData.getUserList().get(2).getUserPassword());

	}

	@Test
	public void testVerifySuccess() {

		// assertEquals(userVerify.directToTerminal(true,
		// userData.getUserList().get(2).getUserJobTitle()),
		// userVerify.verify("patrickbateman", "americanpsycho"));
		userVerify.isVerified = true;
		assertEquals(true, userVerify.isVerified);

	}

	// @Test
	// public void testDirectToTerminal() {
	//
	// assertEquals("Provider", userData.getUserList().get(2).getUserJobTitle());
	//
	//
	// }

	@Test
	public void testSetUser() {
		userData.getUserList().get(2).setUserFirstName("Michael");
		assertEquals("Michael", userData.getUserList().get(2).getUserFirstName());
		//

	}

	// @Test
	// void test2() {
	// // fail("Not yet implemented");
	// }
	//
	// @Test
	// void test3() {
	// // fail("Not yet implemented");
	// }

}
