package aseLab3;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class TestCases {
	double decimals = 0.0001;
	
	
	//Unit testing: Test case for Factorial

		@Test
		public void factorial1() throws Exception
		{
			assertEquals(120, TrigonometricLibrary.factorial(5));
		}

		@Test
		public void factorial2() throws Exception
		{
			assertEquals(1, TrigonometricLibrary.factorial(-1));
		}
		
		@Test
		public void factorial3() throws Exception
		{
			assertEquals(1, TrigonometricLibrary.factorial(0));
		}
	//Unit testing: Test case for checking power
		
		@Test
		public void power1() throws Exception
		{
			assertEquals(Math.pow(3,4),TrigonometricLibrary.power(3,4),0);
		}
	
		@Test
		public void power2() throws Exception
		{
			assertEquals(Math.pow(-1.2,3),TrigonometricLibrary.power(-1.2,3),0);
		}

		@Test
		public void power3() throws Exception
		{
			assertEquals(Math.pow(1.2,4),TrigonometricLibrary.power(1.2,4),0);
		}
	
		@Test
		public void degreeToRadianTest() throws Exception
		{
			assertEquals(Math.toRadians(90),TrigonometricLibrary.degreeToRadian(90),decimals);
		}
		
		@Test
		public void radianToDegreeTest() throws Exception
		{
			assertEquals(Math.toDegrees(4.056),TrigonometricLibrary.radianToDegree(4.056),decimals);
		}
		
//Test cases for four quadrants for sinFunction
	
	@Test
	public void sinTest1() throws Exception
	{
		assertEquals(0.4999, TrigonometricLibrary.sinFunction(TrigonometricLibrary.degreeToRadian(30)), decimals);
		
	}
	
	@Test
	public void sinTest2() throws Exception
	{
		assertEquals(Math.sin(2.0792), TrigonometricLibrary.sinFunction(2.0792), decimals);
	}
	
	@Test
	public void sinTest3() throws Exception
	{
		
		assertEquals(TrigonometricLibrary.sinFunction(Math.toDegrees(3.7223)), TrigonometricLibrary.sinFunction(TrigonometricLibrary.radianToDegree(3.7223)), decimals);
	}
	
	@Test
	public void sinTest4() throws Exception
	{
		assertEquals(TrigonometricLibrary.sinFunction(Math.toRadians(300)), TrigonometricLibrary.sinFunction(TrigonometricLibrary.degreeToRadian(300)), decimals);
		
	}
	
	@Test
	public void sinTest5() throws Exception
	{
		assertEquals(Math.sin(-35), TrigonometricLibrary.sinFunction(-35), decimals);
	}
	
	
//Test cases for four quadrants for cosFunction
	
	@Test
	public void cosTest1() throws Exception
	{
		assertEquals(0.8191, TrigonometricLibrary.cosFunction(TrigonometricLibrary.degreeToRadian(35)), decimals);
	}
	
	@Test
	public void cosTest2() throws Exception
	{
		assertEquals(Math.cos(3.095), TrigonometricLibrary.cosFunction(3.095), decimals);
	}
	
	@Test
	public void cosTest3() throws Exception
	{
		assertEquals(TrigonometricLibrary.cosFunction(Math.toDegrees(1.4532)), TrigonometricLibrary.cosFunction(TrigonometricLibrary.radianToDegree(1.4532)), decimals);
	}
	
	@Test
	public void cosTest4() throws Exception
	{
		assertEquals(TrigonometricLibrary.cosFunction(Math.toRadians(290)), TrigonometricLibrary.cosFunction(TrigonometricLibrary.degreeToRadian(290)), decimals);
	}
	
	@Test
	public void cosTest5() throws Exception
	{
		assertEquals(Math.cos(-15), TrigonometricLibrary.cosFunction(-15), decimals);
	}

//Test cases for four quadrants for tanFunction
	
	@Test
	public void tanTest1() throws Exception
	{ 
		assertEquals(1, TrigonometricLibrary.tanFunction(TrigonometricLibrary.degreeToRadian(45)), decimals);
		
	}
	
	@Test
	public void tanTest2() throws Exception
	{
		assertEquals(Math.tan(2.6179), TrigonometricLibrary.tanFunction(2.6179), decimals);
	}
	
	@Test
	public void tanTest3() throws Exception
	{
		assertEquals(TrigonometricLibrary.tanFunction(Math.toDegrees(1.1666)), TrigonometricLibrary.tanFunction(TrigonometricLibrary.radianToDegree(1.1666)), decimals);
	}

	@Test
	public void tanTest4() throws Exception
	{
		assertEquals(TrigonometricLibrary.tanFunction(Math.toRadians(320)), TrigonometricLibrary.tanFunction(TrigonometricLibrary.degreeToRadian(320)), decimals);
	}
	
	@Test
	public void tanTest5() throws Exception
	{
		assertEquals(Math.tan(-30), TrigonometricLibrary.tanFunction(-30), decimals);
	}
	
	@Test
	public void tanTest6() throws Exception
	{
		assertEquals(Math.tan(2.512), TrigonometricLibrary.tanFunction(2.512), decimals);
	}
	
	@Test
	public void tanTest7() throws Exception
	{
		assertEquals(Math.tan(1.5707963268), TrigonometricLibrary.tanFunction(1.5707963268), decimals);
	}
}