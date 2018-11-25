package application;

public class Model {

	public int calculate(String operator, int x, int y) {
		switch (operator) {
		case "+":
			return x + y;
		case "-":
			return x - y;

		case "*":
			return x * y;

		case "/":
			return x / y;
		default:
			break;
		
		}
	   
		 return 0;

	}

}
