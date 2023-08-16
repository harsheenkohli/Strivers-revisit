import java.util.Scanner;
public class OddEvenSumOptimised {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] a = str.toCharArray();
		int[] arr = new int[a.length];
		for(int i=0;i<a.length;i++){
			arr[i] = Character.getNumericValue(a[i]);
		}
		int sum1=0,sum2=0;
		for(int i : arr){
			if(i%2==0)
				sum1+=i;
			else
				sum2+=i;
		}
		
		System.out.print(sum1 + " "+ sum2);

	}
}
