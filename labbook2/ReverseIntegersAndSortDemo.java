package labbook2;

public class ReverseIntegersAndSortDemo {

	public static void main(String[] args) {
		int[] arr = {78,2, 9, 178,1000, 3456, 58, 79, 89, 150};
		int len = arr.length;
		
		ReverseIntegersAndSort obj = new ReverseIntegersAndSort();
		int[] res = obj.getSorted(arr, len);
		
		for(int i : res)
			System.out.println(i);

	}

}
