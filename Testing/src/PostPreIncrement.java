
public class PostPreIncrement {

	public static void main(String[] args) {
		
		Thread t1 = new Thread("GEEKS"); 
        Thread t2 = new Thread("GEEKS"); 
        Thread t3 = t1; 
  
        String s1 = new String(); 
        String s2 = new String(); 
  
        System.out.println(t1 == t3); 
        System.out.println(t1 == t2); 
        System.out.println(s1 == s2); 
  
        System.out.println(t1.equals(t2)); 
        System.out.println(s1.equals(s2)); 
		
		
	}

}
