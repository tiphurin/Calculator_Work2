import java.util.Scanner;


public class MyCalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		
		double num1=0;
		double num2=0;
		
		System.out.println("Enter 1 >> Plus     (+)");
		System.out.println("Enter 2 >> Minus    (-)");
		System.out.println("Enter 3 >> Multi    (*)");
		System.out.println("Enter 4 >> Divide   (/)");
		System.out.println("Enter 5 >> Mean     ");
		
		System.out.print("Please choose function : ");
		int operator = input.nextInt();
		
		if(operator==1 || operator==2 || operator==3 || operator==4){
			System.out.print("Enter num1 :");
			num1 = input.nextDouble();
		
			System.out.print("Enter num2 :");
			num2 = input.nextDouble();
		}
		else {
			System.out.print("Enter amount of number :");
			num1 = input.nextDouble();
			
			for(int i=0;i<num1;i++){
				int y = i+1;
				System.out.print("Enter num"+y+" :");
				num2 = num2+input.nextDouble();
			}
		}
		
		
		
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
		else if(operator == 5){
			double sum = num2/num1;
			System.out.println("Mean is "+sum);
		}

	}

}
