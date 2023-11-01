
public class T1Fun1 {
	
	public static int Fun1(int x, int k){
		int i = 0;
		int y = x + k;
		
		do{
			if (x/2 < 2){
				k = y - x;
			}
			else{
				x = k - 2;
				y = y + x;
			}
			k = x + y;
			i = i + 1;
		}while (i < x);
		
		if (x < 0 && y < 0){
			k = y - x;
		}
		else{
			k = y + x;
		}
		
		return k;
	}
}
