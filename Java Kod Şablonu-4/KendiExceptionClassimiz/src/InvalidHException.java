
public class InvalidHException extends ArithmeticException{
	
	public InvalidHException(String message) {
		
		super(message);
		
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		//super.printStackTrace();
		System.out.println("Bu bir invalid age hatasidir..");
		
	}

	
	
	
}
