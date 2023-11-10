
public class Assignment8 {

	public static void main(String[] args) {
		
		int x = -885;
		int k = 14;
		int program = T1Fun1.Fun1(x, k);
		int mutant = T1Fun1.Fun2(x, k);
		
		System.out.println("***************");
		System.out.println("***************");
		
		System.out.println("The result for program is: " + program);
		
		System.out.println("The result for mutant is: " + mutant);
		
		if (program != mutant) {
			System.out.println("The mutant has been strongly killed");
		} else {
			System.out.println("Review output to determine if the mutant may be weakly killed");
		}
	}
}
