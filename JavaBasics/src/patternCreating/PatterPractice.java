package patternCreating;

public class PatterPractice {
	
	public static void PatternMaking(Integer n){
		
		int i, j;
		
		for (i=0;i<n;i++){
			
			for (j=0; j<=i; j++){
				System.out.print("! "); // Try to print i, j 
			}
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		PatternMaking(5);
		
	}

}
