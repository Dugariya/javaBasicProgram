
public class ArrayBasicQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1 ,2,3,4,5,1,2,3,4,5,6};
		
		int min= arr[0];
		int max =arr[0];
		
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i]>max) 
				max =arr[i];
			else if(arr[i]<min) min =arr[i];
			
			
		}
		System.out.println("min elemet"+ min + " max elements "+ max);

	}

}
