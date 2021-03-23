
public class StaticAndNonStaticMethods {

	String name = "Tom";
	static int age = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum();
		StaticAndNonStaticMethods.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticMethods.age);
		
		StaticAndNonStaticMethods obj= new StaticAndNonStaticMethods();
		obj.sendmail();
		System.out.println(obj.name);
		
		obj.sum(); //Should not be used in regular practice.
		
		
		

	}
	
	public void sendmail(){
		System.out.println("Send mail method");
	}

	
	public static void sum(){
		System.out.println("Sum Method");
	}
}
