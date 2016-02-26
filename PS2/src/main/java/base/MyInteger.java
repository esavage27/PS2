package base;

public class MyInteger {
	//defining iValue and a counter to be used in isPrime method
	private int iValue;
	private static int i;
	
	//constructor for MyInteger
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	
	//getter for iValue
	public int getiValue() {
		return iValue;
	}
	
	//isEven method with no args
	//isEven returns true if the number is even by using modulo
	public boolean isEven() { 
		int a = this.iValue % 2;
		if (a == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isEven method with an int arg
	public static boolean isEven(int d) { 
		if ((d % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isEven method with a MyInteger arg
	public static boolean isEven(MyInteger m) { 
		if ((m.getiValue() % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}	
	
	//isOdd methos with no args
	//isOdd returns true if the number is odd by using modulo
	public boolean isOdd() {
		int b = iValue % 2;
		if (b == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isOdd method with an int arg
	public static boolean isOdd(int d) {
		if ((d % 2) == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isOdd method with a MyInteger arg
	public static boolean isOdd(MyInteger m) {
		if ((m.getiValue() % 2) == 1) {
			return true;
		}
		else {
			return false;
		}
	}
		
	//isPrime with no args
	//isPrime returns true if the number is prime by using a for loop and modulo
	public boolean isPrime() {
		for(i=2; i < (this.iValue); i = i+1) {
			int c = this.iValue % i;
			if (c == 0) {
				return false;
			}
		}
		return true;
	}
	
	//isPrime with an int arg
	public static boolean isPrime(int d) {
		for(i=2; i < (d); i = i+1) {
			int f = d % i;
			if (f == 0) {
				return false;
			}
		}
		return true;
	}
	
	//isPrime with a MyInteger arg
	public static boolean isPrime(MyInteger m) {
		for(i=2; i < (m.getiValue()); i = i+1) {
			int e = m.getiValue() % i;
			if (e == 0) {
				return false;
			}
		}
		return true;
	}
	
	//equals with an int arg
	//equals returns true if the parameter passing through and iValue are the same
	public boolean equals(int d) {
		if (d == this.iValue) {
			return true;
		}
		else {
			return false;
			}
	}
	
	//equals with a MyInteger arg
	public boolean equals(MyInteger m) {
		if (m.getiValue() == this.iValue) {
			return true;
		}
		else {
			return false;
		}
	}
}
