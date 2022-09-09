import java.util.Scanner;
public class EX05_02 {
;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number please");
		int x = input.nextInt();
System.out.println(" the sum of the digits of number "+ x +" is " + Sumdigits(x));	

	}
public static int Sumdigits(int n) {
	int sum=0;
	while(n!=0) {
		sum+=n%10;
		n=n/10;
	}
	return sum;
	
}
}
