package patternCreating;

public class OppositePyramidPractice {

	public static void main(String[] args) {

		int i, j;
		int n =5;
		
		for (i=0; i<n; i++){
			
			for (j=4; j<=3*(n-i); j++){
				System.out.print(" ");
			}
			
			for (j=0; j<=i; j++){
				System.out.print("* ");
			}
			
		System.out.println();	
		}
	}

}
