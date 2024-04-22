import arithmatic.ArithmaticOperations;
import java.util.Scanner;
public class ArithmeticMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Prince Thomas   23MCA045  15/04/24");
		ArithmaticOperations operations = new ArithmaticOperations();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();
		System.out.println("Addition: " + operations.add(num1, num2));
		System.out.println("Subtraction: " + operations.subtract(num1, num2));
		System.out.println("Multiplication: " + operations.multiply(num1, num2));
		System.out.println("Division: " + operations.divide(num1, num2));
	}
}
