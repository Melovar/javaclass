package nov5;

public class TryCatchDemoONe {
	public static void main(String[] args){

}
public static void demoOne() {
	
	int num1;
	int num2;
	
	
	
	
	try {
		
		num1 =0;
		num2 =50/num1;
		
	}catch(ArithmeticException e) {
		System.out.println("something went wrong");
	}
	catch(NullPointerException e) {
		System.out.println("it's a null pointer exception");
	}
	System.out.println("this is end of try-catch block");
}

	public static void demoTwo() {
		try {
			int a[] = new int[5];
			a[4]=30/0;
			
		}
	catch (ArithmeticException e) {
		System.out.println("this is Arithmetic exception");
		}
		
		
	catch ( ArrayIndexOutOfBoundsException e) {
		System.out.println("the value is outside of an array");
	}
		
	catch (Exception e) {
		System.out.println("something went wrong!");
		
	}
		System.out.println("Out of try catsh block");
		
		
		
	
	}
		public static void demoThree() {
			try {
				int num = 120/0;
				System.out.println(num);
				
			}catch (ArithmeticException e) {
				System.out.println("Math exception");
				
			}finally{
				System.out.println("this is finally block");
				
				
				
			}
		}
	
	
}
