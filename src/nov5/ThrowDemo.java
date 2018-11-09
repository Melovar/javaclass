package nov5;

public class ThrowDemo {
	
	public static void main(String[]args) {
		System.out.println("welcome to registration process");
		checkEligilibility(10,30);
		
		
	}
	static void checkEligilibility(int stuAge, int stuWeight) {
		if(stuAge <12 && stuWeight < 40) {
			throw new ArithmeticException("Student is not eligible");
			
		}else {
			System.out.println("Student is elegible");
			
		}
	}

}
