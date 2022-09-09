import java.util.Scanner;

public class EX05_04 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	    System.out.println("enter the number please");
	    int x = input.nextInt();
	    reverse(x);
	}
	public static void reverse(int x) {
		int reversed = 0;
		while(x!=0) {
		reversed=reversed*10 + (x%10);
		x=x/10;
		}

System.out.println("the reverse of the number " + x + " is " + reversed);
	}
}
