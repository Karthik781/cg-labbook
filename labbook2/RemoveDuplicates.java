package labbook2;
import java.util.Arrays;

public class RemoveDuplicates {

		int[] modifyArray(int[] arr, int n){
			
			Arrays.sort(arr);
			int j=0;
			for(int i =0; i<n-1; i++){
				if(arr[i]!=arr[i+1]){
					arr[j++]=arr[i];
				}
			}
			arr[j++] = arr[n-1];
			
			int[] arr1 = new int[j];
			int k=0;
			for(int i=j-1; i>=0; i--){
				arr1[k++] = arr[i];
			}
			return arr1;
		}
}
