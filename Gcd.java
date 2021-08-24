
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =4,b=9;
		int ans =findGCD(a, b);
         System.out.println(ans);
	}
	public static int findGCD(int a, int b)  
	{  
	while(b != 0)  
	{  
	if(a > b)  
	{  
	a = a - b;  
	}  
	else  
	{  
	b = b - a;  
	}  
	}  
	return a;  
	}  
	}  


