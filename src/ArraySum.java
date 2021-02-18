import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no of elements you want in array:");
		n= sc.nextInt();
		int a[] = new int[n];
		 System.out.println("enter all the elements:");
		 for(int i=0; i<n; i++)
		 {
			 a[i] = sc.nextInt();
			 sum = sum + a[i];
		 }
		 System.out.println("sum:"+sum);
		

	}

}
