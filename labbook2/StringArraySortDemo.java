package labbook2;

public class StringArraySortDemo {

	public static void main(String[] args) {
		String[] s = {"acura","Ford", "Skoda","kia", "Vw", "hyundai"};
		StringArraySort obj = new StringArraySort();
		String[] res = obj.sortStrings(s);
		for(String i : res){
			System.out.println(i);
		}
	}

}
