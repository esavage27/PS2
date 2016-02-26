package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	//defining some variables
		static MyInteger myintodd;
		static MyInteger myinteven;
		static int intodd;
		static int inteven;
		static MyInteger myintprime;
		static int intprime;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myintodd = new MyInteger(9);
		myinteven = new MyInteger(10);
		intodd = 9;
		inteven = 10;
		myintprime = new MyInteger(11);
		intprime = 11;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	//testing the isEven method in MyInteger class
	@Test
	public void testisEven() {
		assertTrue("Should be true",myinteven.isEven());
		assertFalse("Should be false",myintodd.isEven());
		assertTrue("Should be true",MyInteger.isEven(inteven));
		assertFalse("Should be false",MyInteger.isEven(intodd));
		assertTrue("Should be true",MyInteger.isEven(myinteven));
		assertFalse("Should be false",MyInteger.isEven(myintodd));
	}
	
	//testing the isOdd method in MyInteger class
	@Test
	public void testisOdd() {
		assertTrue("Should be true",myintodd.isOdd());
		assertFalse("Should be false",myinteven.isOdd());
		assertTrue("Should be true",MyInteger.isOdd(intodd));
		assertFalse("Should be false",MyInteger.isOdd(inteven));
		assertTrue("Should be true",MyInteger.isOdd(myintodd));
		assertFalse("Should be false",MyInteger.isOdd(myinteven));
	}
	
	//testing isPrime method in MyInteger class
	@Test
	public void testisPrime() {
		assertTrue("Should be true",myintprime.isPrime());
		assertFalse("Should be false",myinteven.isPrime());
		assertTrue("Should be true",MyInteger.isPrime(intprime));
		assertFalse("Should be false",MyInteger.isPrime(inteven));
		assertTrue("Should be true",MyInteger.isPrime(myintprime));
		assertFalse("Should be false",MyInteger.isPrime(myinteven));
	}
	
	//testing equals method in MyInteger class
	@Test
	public void testequals() {
		assertTrue("Should be true",myinteven.equals(inteven));
		assertTrue("Should be true",myinteven.equals(myinteven));
		assertFalse("Should be false",myinteven.equals(intodd));
		assertFalse("Should be false",myinteven.equals(myintodd));
	}

}
