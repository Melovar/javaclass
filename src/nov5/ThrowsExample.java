package nov5;

public class ThrowsExample {
	import java.io.IOException;
	

	public static void main (String[]args) throws ClassNotFoundExceptions, IOException{
		ThrowsDemo obj = new ThrowsDemo();
		obj.myMethod(10);
		
		
	}
}
class ThrowsDemo{
	void myMethod(int num) throws IOException, ClassNotFoundException {
		if(num==1)
			throw new IOException("IOexception Occurrred");
		else
			throw new ClassNoFoundException("ClassNotFound");
		
	}
}
