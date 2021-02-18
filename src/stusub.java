import java.util.Scanner;
public class stusub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st subject marks");
		int sub1 = sc.nextInt();
		System.out.println("enter 2nd subject marks");
		int sub2 = sc.nextInt();
		System.out.println("enter 3rd subject marks");
		int sub3 = sc.nextInt();
		System.out.println("enter 4th subject marks");
		int sub4 = sc.nextInt();
		System.out.println("enter 5th subject marks");
		int sub5 = sc.nextInt();
		int result = sub1+sub2+sub3+sub4+sub5;
		System.out.println("Result is"+result);
		

	}

}
