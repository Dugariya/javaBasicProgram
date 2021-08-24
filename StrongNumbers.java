import java.util.Scanner;

public class StrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		isStrongNumber(n);

	}
	
	public static void isStrongNumber(int n) {
		
		int i ,fac_number,temp_n=n,last_digit,total=0;
		
		while(n!=0) {
			last_digit = n%10;
			i=1;
			fac_number=1;
			while(i <= last_digit) {
				fac_number =fac_number*i;
				i++;
			}
			total =total +fac_number;
			n=n/10;
			
			
			
		}
		if(temp_n == total) {
			System.out.print(true);
		}else System.out.print(false);
		
	}

}
