/**
 * 
 */

/**
 * @author lexka
 *
 */
package your.pack.yourprogram;
public class Calculo {
	
	static double addition(double numA, double numB)
	{
		return (numA + numB);
	}
	
	static double soutraction(double numA, double numB)
	{
		return (numA - numB);
	}
	
	static double multiplication(double numA, double numB)
	{
		return (numA * numB);
	}
	
	static double Square(double numA)
	{
		return (numA * numA);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d_numA, d_numB;
		d_numA = 5;
		d_numB = 3;
		
		System.out.println("---------------------------");
		System.out.println("SOME ARITHMETIC OPERATIONS");
		System.out.println("---------------------------\n");
		System.out.println("1.Addition:");
		System.out.println(" "+ d_numA +" + "+d_numB +" = " + addition(d_numA, d_numB) + "\n");
		System.out.println("2.Soustraction:");
		System.out.println(" "+ d_numA +" - "+d_numB +" = " + soutraction(d_numA, d_numB)+ "\n");
		System.out.println("3.Multiplication:");
		System.out.println(" "+ d_numA +" x "+d_numB +" = " + multiplication(d_numA, d_numB)+ "\n");
		System.out.println("4.Square:");
		System.out.println(" Square("+ d_numA +") = " + Square(d_numA)+ "\n");
		System.out.println("---------------------------");
	}

}
