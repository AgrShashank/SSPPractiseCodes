package javaBasicPackage;

public class ReverseAString {

	public static void main(String[] args) {
		
		//String s = "knahsahS";					// Note String is a immutable Class in Java. 
//		int len = s.length();
//		String rev = "";
//		
//		for (int i = len-1; i>=0; i--){
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);
//		
//		StringBuffer sb = new StringBuffer(s);  // Note StringBuffer is mutable Class in Java.
//		System.out.println(sb.reverse());
		
		String str = "knowledge";
		//String s = str;
		str = str.concat(" Base");
		System.out.println(str +" and s is " );
	}
}
