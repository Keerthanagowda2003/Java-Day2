package Scanner;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a,b,c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is large");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is large");
		}
		else
		{
			System.out.println("C is large");
		}
	}

}
