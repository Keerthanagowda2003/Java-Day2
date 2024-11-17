package Scanner;
import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 String validUserId="Keerthana";
		 String validPassword="Keerthana123";
		 
		 System.out.println("Enter user ID:");
		 String userId=scanner.nextLine();
		 
		 System.out.println("Enter Password:");
		 String password=scanner.nextLine();
		 
		 if(userId.equals(validUserId))
		 {
			 if(password.equals(validPassword))
			 {
				 System.out.println("Login successful");
			 }
			 else
			 {
				 System.out.println("Login unsuccessful");
			 }
		 }
		 else
		 {
			 System.out.println("Invalid user ID");
		 }
	}

}
