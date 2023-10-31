
public class Function {
	
	public static int Fun1(int x, int k){
		System.out.println("Reached 1");
		int i = 0;
		System.out.println("Reached 2");
		int y = x + k;
		System.out.println("Reached 3 - y assignment");
		System.out.println("x: " + x + ", k: " + k + ", y: "+y);
		boolean reached10 = false;
		
		do{
			if (x/2 < 2){
				if (reached10) {System.out.println("Reached 10 - true");}
				else {System.out.println("Reached 4");}
				k = y - x;
				System.out.println("Reached 5 - k assignment");
				System.out.println("x: " + x + ", k: " + k + ", y: "+ y);
			}
			else{
				System.out.println("Reached 4");
				x = k - 2;
				System.out.println("Reached 6 - x assignment");
				System.out.println("x: " + x + ", k: " + k + ", y: "+ y);
				y = y + x;
				System.out.println("Reached 7 - y assignment");
				System.out.println("x: " + x + ", k: " + k + ", y: "+ y);
			}
			k = x + y;
			System.out.println("Reached 8 - k assignment");
			System.out.println("x: " + x + ", k: " + k + ", y: "+ y);
			i = i + 1;
			System.out.println("Reached 9");
		}while (i < x);
		System.out.println("Reached 10 - false");
		
		if (x < 0 && y < 0){
			System.out.println("Reached 11");
			k = y - x;
			System.out.println("Reached 12 - k assignment");
			System.out.println("x: " + x + ", k: " + k + ", y: "+ y);
		}
		else{
			System.out.println("Reached 11");
			k = y + x;
			System.out.println("Reached 13 - k assignment");
			System.out.println("x: " + x + ", k: " + k + ", y: "+ y);
		}
		System.out.println("Reached 14");
		return k;
	}
}
