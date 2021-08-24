
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;int b= 2;
		
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a + " "+ b);
	
		int c =2; int d=3;
		c = c+d;
		d=c-d;
		c=c-d;
        System.out.println(c + " "+ d );
         
        int n1 =40 ;
        int n2 =55;
        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
        System.out.println(n1 + " "+ n2 );
        
        int p1 =100,p2=200;
        p1=p1*p2;
        p2=p1/p2;
        p1=p1/p2;
        
        System.out.println(p1+ " "+p2 );


        		
         
	}

}
