import java.util.Scanner;

public class ConvertingDegrees{
	public static void main(String[]args){
		System.out.println("Input Fahrenheit: ");
		Scanner input=new Scanner(System.in);
		double temp1 = input.nextDouble();
		System.out.println("The temparature is "+ (5.0/9)*(temp1-32) +" Degrees Celsius");
		}
	
	}