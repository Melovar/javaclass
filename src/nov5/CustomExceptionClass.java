package nov5;

public class CustomExceptionClass {
	
	void produtCheck(int weight) throws InvalidProductException{
		if(weight <100) {
			throw new InvalidProductException("Product is invalid");
			
		}
	}
	
public static void main (String[]args) {
	CustomExceptionClass obj = new CustomExceptionClass();
	try {
		obj.produtCheck(160);
		System.out.println("product is valid");
		
	}
}
}




class InvalidProductException extends Exception {
	
	InvalidProductException (String s){
		super(s);
		
	}
}
