import java.util.Scanner;

/*
 * In fibonacci series, next number is the sum of previous two numbers 
 * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers
 *  of fibonacci series are 0 and 1.
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a elemets you want to seen fibonacci series");
		int n =sc.nextInt();
		fibonacciSeries(n);

    

	}
	public static void fibonacciSeries(int n) {
		
		int n1=0,n2=1,n3 ,i;
		System.out.print(n1+" "+n2 );
		i=2;
		while(i<n) {
			n3 =n1+n2;
			System.out.print(" "+ n3+ " ");
			n1=n2;
			n2=n3;
			i++;
		}
	}

}
