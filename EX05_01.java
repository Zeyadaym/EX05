
public class EX05_01 {

	public static void main(String[] args) {
		for(int i=1 ;i<=100;i++) {
		System.out.print(getpentagona1numbers(i));
		System.out.print("  ");
			if(i%10==0)
				System.out.println();
		}

	}
	public static int getpentagona1numbers(int n) {
return n*(3*n-1)/2;
}
}