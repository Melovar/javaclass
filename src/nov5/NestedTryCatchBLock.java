package nov5;

public class NestedTryCatchBLock {
	
	public static void main(String[]args) {
	}	
	//parent try block
	 try {
		//child try block
		try {
			System.out.println("inside block1");
			int b=45/0;
			System.out.println(b);
		}catch (ArithmeticException e1) {
			System.out.println("exception: e1");
		}
		//Child try block2
		try {
			System.out.println("inside block2");
			int b = 45/0;
			System.out.println(b);
		}catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Exceptions: e2");
		}
		System.out.println("Just other statement");
	}
	
	
	
	

			
			
		}
	}

}
