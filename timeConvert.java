import java.util.Scanner;

public class timeConvert{
	
	public static void main(String[] args){
		 int hours, minutes, seconds;
		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("Enter hours ");
		 hours = keyboard.nextInt();
		 System.out.println("Enter minutes ");
		 minutes = keyboard.nextInt();
		 System.out.println("Enter seconds ");
		 seconds = keyboard.nextInt();
		 System.out.println("You have given: " + hours + " Hours and " + minutes + " Minutes and " + seconds + " Seconds" );
		 int hourss = hours * 60 * 60;
		 int minutess = minutes * 60;
		 System.out.println("The hours in seconds would be: " + hourss);
		 System.out.println("The minutes in seconds would be: " + minutess);
		 int sum = hourss + minutess + seconds;
		 System.out.print("In seconds, all of it would be: " + sum);
	}
}