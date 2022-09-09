import java.util.Scanner;
public class EX05_18 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int x;
System.out.println("enter 4 numbers please");
System.out.print("number");
System.out.print("            ");
System.out.println("SquareRoot");
for(int i = 1 ; i<=4;i++) {
	 x = input.nextInt();
	System.out.print(x+"            "+Math.sqrt(x));
	System.out.println("");
	if(i==2)
		System.out.println("--------");
}
	}

}
