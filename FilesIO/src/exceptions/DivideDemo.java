package exceptions;

public class DivideDemo {

	public static int divide( int a, int b) throws DivideByZeroException {
		if (b == 0) {
			throw new DivideByZeroException("Can't divide by zero");
		}
		int result = a / b ;
		return result;
	}


	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int answer = 0;
		
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		
		try {
			answer = divide(x,y);
		} catch(DivideByZeroException e) {
			System.out.println("Exception" + e.getMessage());
		}
		

		System.out.println(args[0] + " / " + args[1] + " = " + answer);

	}

}
