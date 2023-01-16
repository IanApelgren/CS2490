import java.util.Scanner;

/*
 * Conversion Program
 * This program will ask the user to input meters
 * After input, a menu will be displayed:
 * 1. Convert to kilometers
 * 2. Convert to inches
 * 3. Convert to feet
 * 4. Quit
 *
 * The user will select the conversion and the converted answer will be displayed.
 * The program should redisplay the menu for another selection.
 * Quit program when user selects 4.
 */

public class MetersConversion {

	public static void main(String[] args) {
		// Initialize variables
		Scanner input = new Scanner(System.in);
		int selection;
		double answer;
		double meters;
		
		// Input the distance in Meters to be Converted
		System.out.print("Enter distance in meters:  ");
		 meters = input.nextDouble();	
		
			System.out.println("1. Convert to kilometers");
			System.out.println("2.  Convert to inches");
			System.out.println("3.  Convert to feet");
			System.out.println("4.  Quit the program\n\n");
			 selection = input.nextInt();
			 input.close();
			 
			if(selection == 1){
				answer = meters * 0.001;
				System.out.println(answer);
			}
			else if(selection == 2){	
				answer = meters * 36.37;
				System.out.println(answer);
			}
			else if(selection == 3){
				answer = meters * 3.201;
				System.out.println(answer);
			}
			else {
				System.out.println("Bye!");
			}	
			}
		
			
		}
	

