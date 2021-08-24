import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		
		int factorial_Number =1, i=1;
		while(i<=n) {
			factorial_Number=factorial_Number*i;
			i++;
		}
		System.out.println(factorial_Number);

	}

}
