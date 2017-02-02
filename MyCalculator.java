import java.util.Scanner;


public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		
		
		System.out.println("Enter 1 >> Plus   (+)");
		System.out.println("Enter 2 >> Minus  (-)");
		System.out.println("Enter 3 >> Multi  (*)");
		System.out.println("Enter 4 >> Divide (/)");
		
		System.out.print("Please choose function : ");
		int operator = input.nextInt();
		
		System.out.print("Enter num1 :");
		double num1 = input.nextDouble();
		
		System.out.print("Enter num2 :");
		double num2 = input.nextDouble();
		
		if(operator == 1){
			double sum = num1 + num2;
			System.out.println(num1+" + "+num2+" = "+sum);
		}
		else if(operator == 2){
			double sum = num1 - num2;
			System.out.println(num1+" - "+num2+" = "+sum);
		}
		else if(operator == 3){
			double sum = num1 * num2;
			System.out.println(num1+" * "+num2+" = "+sum);
		}
		else if(operator == 4){
			double sum = num1 / num2;
			System.out.println(num1+" / "+num2+" = "+sum);
		}

	}

}
