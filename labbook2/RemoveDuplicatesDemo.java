package labbook2;

public class RemoveDuplicatesDemo {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 6, 3, 4, 4, 10, 13, 11, 10, 19,100,100};
		int len = arr.length;
		RemoveDuplicates obj = new RemoveDuplicates();
		int[] res = obj.modifyArray(arr,len);
		
		for(int i:res)
		System.out.println(i);

	}

}
