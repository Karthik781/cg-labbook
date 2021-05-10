package labbook2;
import java.util.Arrays;

public class SecondSmallest {


	public int secondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}
