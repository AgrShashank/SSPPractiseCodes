package patternCreating;

public class PatternDesigning {

	public static void main(String[] args) {


	    // Function to demonstrate printing pattern 
	        int i, j;
	        int n=7; 
	  
	        // outer loop to handle number of rows 
	        //  n in this case 
	        for(i=0; i<n; i++) 
	        { 
	  
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop     
	            for(j=0; j<=i; j++) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	  
	            // ending line after each row 
	            System.out.println(); 
	        }
	        
	}	}


/* OR EVEN THE BELOW PRINTS THE SAME:
 * int i, j;
		int n =5;
		
		for (i=0; i<n; i++){
			
			for(j=i; j>=0; j--){
				
				System.out.print("~ ");
			}
			
			System.out.println();
		}
	}
	*/
