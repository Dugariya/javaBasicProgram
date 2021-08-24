
public class DecimalToBnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =22;
		decimalTobinary(n);

	}
	public static void decimalTobinary(int n) {
		int binary =0, i=1,ramainder;
		while(n !=0) {
           ramainder = n%2; 
           n =n/2;
           binary = binary+ramainder*i;
           i=i*10;
		}
		System.out.println(binary);
	}

}
