
public class LcmTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lcm,a=5,b=15;
		
		int low = a<b?a:b;
		
		while(true) {
			if(low%a ==0 && low%b==0) {
				lcm =low;
				break;
			}
			low++;
		}
		System.out.println(lcm);

	}

}
