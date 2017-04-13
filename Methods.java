
package CreatingMethods;

/**
 * @author ZiaulChoudhury
 * Demonstrate way of creating various methods
 * as well as validating user input
 */
import java.util.Random;
import java.util.Scanner;

public class Methods {

	public void oddOrEven(int num) {
		/*
		 * oddOrEven method
		 * Given any number, this method determines if it is odd or even and  
		 * prints out "The number x is even" Or "The number x is odd". 
		 * For example, Given the number 11 this method prints out "The number 11 is odd"
		 * To determine odd or even it uses modulus(%) operator upon user entry
		 */
		if (num % 2 == 0){
				System.out.printf("Number %d is even.", num);
			}else {
			System.out.printf("Number %d is odd.\n", num);
			}
		}
	
			
	public double area(int radius) {
		/*
		 * area method
		 * Given a radius, this method calculate and returns the area of a circle.
		 * For example, if radius is 3, this method returns 28.26
		 * Uses the formula sated below and returns the area of a circle
		 */
		double area = 3.14 * (radius*radius);
		return area;
	}
				
	public void coinToss() {
		/*
		 * coinToss method
		 * This method simulates tossing a coin and prints out "Head" or "Tail"
		 * It uses random and % modulus to determine head or tail
		 * for even number it will pick head and for odd it will print tails
		 * For example, when this method is called, it will randomly print out
		 * either "Head" or "Tail"
		 */
		Random rand = new Random();
		int  n = rand.nextInt(10)+1;
		if (n % 2 == 0){
			System.out.println("Head");
		}else{
			System.out.println("Tail");
		}
	}
				
	public String dayOfWeek(int day) {
		/*
		 * dayOfWeek method
		 * Given a number (1-7), this method returns the appropiate day of the week.
		 * For example, Given 1 this method returns "Sunday"
		 * This program uses conditional (if-statement) to determine name of day of the week
		 */
		
		if(day == 1) {
			return ("Sunday");
		}else if (day == 2){
			return ("Monday");
		}else if (day == 3){
			return ("Tuesday");
		}else if (day == 4){
			return ("Wednesday");
		}else if (day == 5){
			return ("Thuresday");
		}else if (day == 6){
			return ("Friday");
		}else if (day == 7){
			return ("Saturday");
		}else
		return "too large or small input";
	}

	//main method
	public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);//creating an object
			Methods m = new Methods();

	        //(1) Determines odd or even number 
	        System.out.print("Type any number: ");
			if(!in.hasNextInt()){   //Validating user input
				String value = in.next();
				System.err.println(value + " is not a valid Input!!\n Program terminates!!!.");
				return;
			}
	        int num = in.nextInt();
	        m.oddOrEven(num);

			//(2) Returns area of a circle
			System.out.print("Type any number: ");
			if(!in.hasNextInt()){   //Validating user input
				String value = in.next();
				System.err.println(value + " is not a valid Input!!\n Program terminates!!!.");
				return;
			}
	        int radius = in.nextInt();
			double area = m.area(radius);
			System.out.printf("If the radius is %d, the area of the circle is %.2f\n", radius, area);

			//(3)
			System.out.print("Coin toss result :" );
			m.coinToss();

			//(4) Returns day of week 
			System.out.print("Type any number (1-7): ");
			if(!in.hasNextInt()){   //Validating user input
				String value = in.next();
				System.err.println(value + " is not a valid Input!!!\nProgram terminates!!!.");
				return;
			}
	        int day = in.nextInt();
	        String dayOfWeek = m.dayOfWeek(day);
	        String add = "";
	        if (day == 1){   //adds number apprehends for 1st/2-3nd/4-7th
	        	add = "st";
	        	System.out.printf("%s is the %d%s of the week.\n", dayOfWeek, day, add);
	        }
	        else if (day == 2||day == 3){
	        	add = "rd";
	        	System.out.printf("%s is the %d%s of the week.\n", dayOfWeek, day, add);
	        }
	        else if (day >= 4 && day <=7){
	        	add = "th";
	        	System.out.printf("%s is the %d%s of the week.\n", dayOfWeek, day, add);
	        }else System.out.printf("Invalid Input Entered!!!");
		}
		
}