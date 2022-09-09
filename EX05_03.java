import java.util.Scanner;
public class EX05_03 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("enter the number please");
    int x = input.nextInt();
    System.out.println(" the reverse of the number "+ x +" is " + reverse(x));
    if(IsPalindrome(x)==true) {
    	System.out.println("it's plaindrome");
	}
    else 
    	System.out.println("it's not plaindrom");
	}
	public static int reverse(int x) {
		int reversed = 0;
		while(x!=0) {
		reversed=reversed*10 + (x%10);
		x=x/10;
		}
		return reversed;
	}
		public static boolean IsPalindrome(int x) {
		boolean c=	reverse(x)==x;
	if(c==true)
		return true;
	else
		return false;
		}
	

}
