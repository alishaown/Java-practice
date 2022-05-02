package starprint;
import java.util.*;
public class calcswitchcase {

	public static void main(String[] args) {
		int a,b,result; // Declaring a variables 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number value:");
        a = s.nextInt(); // getting values from user...
        System.out.print("Enter second number value:");
        b = s.nextInt();
 
        System.out.print("Enter any operator (+, -, *, /): ");
        char opt = s.next().charAt(0); // taking operator
 
        switch(opt) 
        {
            case '+':
            	result = a + b;
                break;    // condition for addition
 
            case '-':
            	result =a - b; 
                break; // condition for subtraction
 
            case '*':
            	result = a * b;
                break; // condition for Multiplicatin
 
            case '/':
            	result = a / b;
                break; // condition for Divison
 
                default: 
                System.out.print("You have entered wrong operator or value");
                return;
        }
 
        System.out.println(result);
    }

	}


