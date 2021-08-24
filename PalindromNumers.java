import java.util.Scanner;

public class PalindromNumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter an elements ");
		int n= sc.nextInt();
		isPalindromNumber(n);

	}
	public static void isPalindromNumber(int n) {
        int reminder ,original_Number = n ,revers_Number = 0,sum =0;
        // how many digits  in a integer numbers  
        int count =0;
        
        while(n > 0) {
        	reminder=n%10;
        	sum =sum+reminder;
        	revers_Number = revers_Number*10 + reminder;
        	n = n/10;
        	count++;
        	
        }
        if(revers_Number == original_Number) {
        	System.out.println("Elements is palindrom ------>"+ original_Number);
        }else  
        	 System.out.println("Elements is not palindrom ------>"+ original_Number);

        System.out.println("elments are digits "+ count  +"\nand all digits sum is "+ sum );

        
	}

}
