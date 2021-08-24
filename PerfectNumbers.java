import java.util.Scanner;

/*
 * perfect number are those number that the sum  total of their dividers 
 */
public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter an elements ");
		int n= sc.nextInt();
		perfectNumbers(n);

		
	}
	public static void perfectNumbers(int n ) {
		int sum = 0, count =1; ;
		for(int i =1 ; i< n;i++) {
			if(n%i==0) {
				sum = sum+i;
				count ++;
			}
		}
		if (sum == n )
			System.out.println(" the number is a  perfect");
		else System.out.println("the number not perfect");
		
		System.out.println("number is a divisor count " + count);
	}

}
