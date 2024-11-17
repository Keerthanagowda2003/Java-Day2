package condition;

public class IfElseIfDemo {

	public static void main(String[] args) {
		int number1=5;
		int number2=10;
		if(number1<number2)
		{
			System.out.println(number1 + " is lesser than " + number2);
		}
		else if(number1>number2)
		{
			System.out.println(number1 + " is greater than " + number2);
		}
		else
		{
			System.out.println(number1 + " is equal to "+number2);
		}
	}

}
