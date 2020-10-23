/**
 * 
 */
package additionArtifactId;

/**
 * @author lexka
 *
 */
public class Addition {

	static double addition(double numA, double numB)
	{
		return (numA + numB);
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
		System.out.println("1. Addition:\n");
		System.out.println(" "+ d_numA +" + "+d_numB +" = " + addition(d_numA, d_numB) + "\n");
		System.out.println("---------------------------\n");
	}

}
