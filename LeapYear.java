import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		isLeapYear(n);
		
		
	}
	public static  void isLeapYear(int year ) {
//		boolean flage =false;
//		if(year%100!=0) {
//			if (year%4==0) {
//				flage=true;
//			}else if(year %400==0) {
//               flage =true;
//			}else flage=false;
//		}
//		if(flage== true) {
//			System.out.println(true);
//		}else System.out.println(false);
//		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
		
	}

}
