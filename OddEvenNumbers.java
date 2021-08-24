import java.util.Scanner;
public class OddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter an elements ");
		int a= sc.nextInt();
		
//		if(a % 2==0) {
//			 System.out.println("The elements is even ---->" + a);
//		}else if (a%2==1) 
//			 System.out.println("the elements is Odd ---->"  + a );
//   
      	if(cheak(a)== true) {
      System.out.println("The elements is even ---->" + a);	
      }
      	else if (a%2==1) 
         System.out.println("the elements is Odd ---->"  + a );
		
		
	}
	
	static boolean cheak(int a ) {
		boolean flage =false;
		if(a % 2==0) {
			flage =true;
			
		}
		return flage;
	}

}
