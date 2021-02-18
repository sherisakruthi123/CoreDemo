import java.util.Scanner;

//Dowhile--sum of positive numbers
public class DowhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);
		//do...while loop continues
		//until entered number is positive
		do
		{
			//add only positive numbers
			sum+= number;
			System.out.println("Enter a number");
			number = input.nextInt();
		}while(number>=0);
		System.out.println("Sum =" +sum);
		input.close();

	}

}
