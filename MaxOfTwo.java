package Scanner;
import java.util.Scanner;

public class MaxOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1,num2;
		System.out.println("Enter First number:");
		num1=sc.nextInt();
		
		System.out.println("Enter Second number:");
		num2=sc.nextInt();
		
		int max=(num1>num2)? num1 : num2 ;
		System.out.println("The maximum of the two number is :" + max);
	}

}
