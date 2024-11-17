package Scanner;
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter a number");
		number=sc.nextInt();
		
		if(number>0)
		{
			System.out.println("The number is Positive");
		}
		else if(number<0)
		{
			System.out.println("The number is Negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}

}
