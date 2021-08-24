import java.util.Scanner;
public class ToCheackPrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1 ;
		Scanner sc = new Scanner(System.in);
		while(i --> 0) {
		System.out.println("Enter a elements");
		int n =sc.nextInt();
		isPrime(n);
		i--;
		     }
	}
	
	static void isPrime(int n ) {
		int m ,i,flage=0;
		m=n/2;
		if(n == 0 || n == 1) {
			System.out.println("Elements is not prime number");
		}else {
			for(i =2;i<=m;i++) {
				if(n%i==0) System.out.println("Elements is not prime number");
				flage =1;
				break;
			}
			if(flage == 0) {
				System.out.println( n + " is prime number");
		}
		
		}
	}

}
