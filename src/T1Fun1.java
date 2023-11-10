
public class T1Fun1 {
	
	public static int Fun1(int x, int k){
		System.out.println("Start Fun 1");
		int i = 0;
		System.out.println("Current Line: 2");
		System.out.println("x = " +x+ ", y = null, k = " +k+ ", i = " + i);
		int y = x + k;
		System.out.println("Current Line: 3");
		System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
		Boolean line10 = false;
		do{
			if (line10) {System.out.println("Current Line: 10 is True");}
			if (x/2 < 2){
				System.out.println("Current Line: 4 is True");
				k = y - x;
				System.out.println("Current Line: 5");
				System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
			}
			else{
				System.out.println("Current Line: 4 is False");
				x = k - 2;
				System.out.println("Current Line: 6");
				System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
				y = y + x;
				System.out.println("Current Line: 7");
				System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
			}
			k = x + y;
			System.out.println("Current Line: 8");
			System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
			i = i + 1;
			System.out.println("Current Line: 9");
			System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
			line10 = true;
		}while (i < x);
		System.out.println("Current Line: 10 is False");
		
		if (x < 0 && y < 0){
			System.out.println("Current Line: 11 is True");
			k = y - x;
			System.out.println("Current Line: 12");
			System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
		}
		else{
			System.out.println("Current Line: 11 is False");
			k = y + x;
			System.out.println("Current Line: 13");
			System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
		}		
		return k;
	}
	
	public static int Fun2(int x, int k){
		System.out.println("**********Start Fun 2**********");
		int i = 0;
		System.out.println("Current Line: 2");
		System.out.println("x = " +x+ ", y = null, k = " +k+ ", i = " + i);
		int y = x + k;
		System.out.println("Current Line: 3");
		System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
		Boolean line10 = false;
		do{
			if (line10) {System.out.println("Current Line: 10 is True");}
			if (x/2 < 2){
				System.out.println("Current Line: 4 is True");
				k = y + x;  //This line was mutated
				System.out.println("Current Line: 5");
				System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
			}
			else{
				System.out.println("Current Line: 4 is False");
				x = k - 2; 
				System.out.println("Current Line: 6");
				System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
				y = y + x;
				System.out.println("Current Line: 7");
				System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
			}
			k = x + y;
			System.out.println("Current Line: 8");
			System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
			i = i + 1;
			System.out.println("Current Line: 9");
			System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
			line10 = true;
		}while (i < x);
		System.out.println("Current Line: 10 is False");
		
		if (x < 0 && y < 0){
			System.out.println("Current Line: 11 is True");
			k = y - x;
			System.out.println("Current Line: 12");
			System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
		}
		else{
			System.out.println("Current Line: 11 is False");
			k = y + x;
			System.out.println("Current Line: 13");
			System.out.println("x = " +x+ ", y = " +y+ ", k = " +k+ ", i = " + i);
		}		
		return k;
	}
}
