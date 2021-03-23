
public abstract class AbstracttionConcept {

	
	//Abstract method can have both Abstract methods as well as Non-Abst methods
	
	public abstract void Homeloan(); //abstract method  -- no method body
	public abstract void Personalloan(); //abstract method  -- no method body
	
	public void credit(){   // Non-abstract method

		System.out.println("Bank -- Credit");
	}

	public void Debit(){    // Non-abstract method
		System.out.println("Bank -- Debit");
	}
	
}
