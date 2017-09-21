package pkgMain;


public class MyInteger {

	private int value;

	public int getValue() {
		return value;
	}

	private void setValue(int value) {
		this.value = value;
	}

	public MyInteger(int value) {
		setValue(value);
	}

	// Determine if even

	public boolean isEven() {
		if (this.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}

	// Determine if odd


	public boolean isOdd() {
		if (this.getValue() % 2 == 1) {
			return true;
		} else if (this.getValue() == 1){
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 1) {
			return true;
		} else if (value == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}

	//Determine if prime 
	
	public boolean isPrimee(int x) {
		for(int y=2; y<x; y++){
			if(x == 2){
				return true; 
				}
			else if (x % y == 0){
				return false;
			}
		return true;
	}
		return false;
	}
	public static boolean isPrime(int value) {
		for(int y=2; y<value; y++){
			if(value == 2){
				return true; 
				}
			else if (value % y == 0){
				return false;
			}
		return true;
	}
		return false;
	}

	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime(myInt);
	}

	public boolean equals(int x){
		if(this.getValue() == x){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean equals(MyInteger myInt) {
		return myInt.equals(myInt);
	}

	
	public static int parseInt(char[]value){
		int n = 0;
		for(int m=0; m<=value.length; m++)
			n = 10*n + (int)(value[m]-'0');
		return n;		
	}
	
	public static int parseInt(String value){
		int n = 0;
		for(int m=0; m<=value.length(); m++)
			n = 10*n + (int)(value.charAt(m)-'0');
		return n;		
	}
	
}