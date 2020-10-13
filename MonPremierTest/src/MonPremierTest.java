

public class MonPremierTest {
	
	// Addition 
	public static double addition(double numberA, double numberB)
	{
		return (numberA + numberB);
	}
	
	// Soustraction 
	public static double soustraction(double numberA, double numberB)
	{
		return (numberA - numberB);
	}
	
	public static void main(String[] args){
		
		System.out.println("Addition: ");
		System.out.println(" 15 + 10 = " + addition(15, 10));
		
		System.out.println("Soustraction: ");
		System.out.println(" 15 - 10 = " + soustraction(15,10));
		System.out.println(" 10 - 15 = " + soustraction(10,15));
	}
	
}
