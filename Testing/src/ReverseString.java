
public class ReverseString {

	public static void main(String[] args) {
		
		String name = "My name is Shashank";
//		String rev = "";
//		
//		for (int i=name.length()-1; i>=0 ; i--) {
//			rev = rev + name.charAt(i);
//		}
//		System.out.println(rev);
		
		
		String arr[] = name.split(" ");
		
		for (int i=3; i>=0;  i--) {
			System.out.print(arr[i]);
			System.out.print("\t");
		}

	}

}
