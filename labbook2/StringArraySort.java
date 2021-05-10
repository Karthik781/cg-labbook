package labbook2;
import java.util.Arrays;

public class StringArraySort {
	
	String[] sortStrings(String[] arr){
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++){
			String s = arr[i];
			int m;
			int len = s.length();
			if(len%2==0){
				m = len/2;
			}else{
				m=len/2 + 1;
			}
			String s1 = s.substring(0, m);
			String s2 = s.substring(m, len);
			s= s1.toUpperCase() + s2.toLowerCase();
			
			arr[i] = s;

		}
		
		return arr;
	}

}
