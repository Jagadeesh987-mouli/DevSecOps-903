package com.jm.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jm.upi.UPIPaymentService;

public class UPIPaymentServiceTest 
{
	private static UPIPaymentService upi;
	@BeforeAll
	public static void setupOnce()
	{
		upi = new UPIPaymentService();
	}
	
	@Test
    public void testUPIPaymentWithValidNos()
    {
		String expected = upi.sendMoney("1234567890", "0987654321", 500);
		//String actual = "Rs. 500 sent to Account No : 0987654321";
		String actual = "Rs. 500.0 sent to Account No : 0987654321";
		assertEquals(actual, expected);
    }
	@AfterAll
	public static void teardownOnce()
	{
		upi = null;
	}
}
