import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		A a=new B();
		try {
			a.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
