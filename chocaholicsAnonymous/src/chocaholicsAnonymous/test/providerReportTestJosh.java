package chocaholicsAnonymous.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chocaholicsAnonymous.providerDatabase;
import chocaholicsAnonymous.providerReport;

class providerReportTestJosh {
	providerReport report;
	providerDatabase providers;

	@BeforeEach
	void setUp() throws Exception {
		providers = new providerDatabase();
		report = new providerReport();
	}

	@Test
	void test() {
		assertEquals("Anita Dikinme", report.returnName());
		assertEquals("123456789", report.returnProviderNum());
		assertEquals("69 Hellen Keller Blvd", report.returnAddress());
		assertEquals("Tuscaloosa", report.returnCity());
		assertEquals("Tuscaloosa", report.returnCity());
		assertEquals("AL", report.returnState());
		assertEquals("35404", report.returnZip());
		assertEquals(1, report.returnConNum());
		assertEquals(10, report.returnFee());
	}

}
