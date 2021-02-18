import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Basic salary");
				int basic = sc.nextInt();
				System.out.println("HRA");
				int HRA = sc.nextInt();
				System.out.println("DA");
				int DA = sc.nextInt();
				System.out.println("PF");
				int PF = sc.nextInt();
				int netsalary = basic+HRA+DA-PF;
				System.out.println("net salary is"+netsalary);
				


	}

}	
