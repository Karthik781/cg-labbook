package labbook2;
import java.util.Arrays;

public class ReverseIntegersAndSort {
	
	int[] getSorted(int[] arr, int n){
		for(int i=0; i<n; ){
			int ele = arr[i];
//			System.out.println(ele);
			int num = 0;
			while(ele>0){
				int k = ele % 10;
				num = num*10 + k ;
				ele = ele/10;
			}
			arr[i] = num;
			i++;
		}
		
		Arrays.sort(arr);
		
		
		return arr;
	}
}
