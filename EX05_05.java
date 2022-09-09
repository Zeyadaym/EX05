import java.util.Scanner;
public class EX05_05 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter three numbers please");
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double x3 = input.nextDouble();
		displaySortedNumbers(x1,x2,x3);

	}/*
public static void displaySortedNumbers(double num1, double num2, double num3) {
	double min,max,middle = 0;
	min = (num1>num2?num2:num1);
	max=(num1>num2?num1:num2);
	min=(num2>num3?num3:num2);
	max=(num2>num3?num2:num3);
	min=(num1>num3?num3:num1);
	max=(num1>num3?num1:num3);
	if(Math.max(min,num1)==Math.min(max,num1))
		middle =num1;
	else if (Math.max(min,num2)==Math.min(max,num2))
		middle =num2;
	else if (Math.max(min,num3)==Math.min(max,num3))
		 middle = num3;
	System.out.println(max+ ">" + middle+">"+min);
}
*/
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double max1=0;double max2=0;double max3=0; double maxtotal=0; double middle=0; double min=0;
		max1=Math.max(num1,num2);
		max2=Math.max(num2,num3);
		max3=Math.max(num3,num1);
		if(max1==max2&&max2>max3) {
			maxtotal=max2;
			middle=max3;
			min=Math.min(num3,num1);
		}
		else if (max2==max3&&max2>max1) {
			maxtotal=max2;
			middle=max1;
			min=Math.min(num1,num2);
		}
			
		else if (max1==max3&&max1>max2 ) {
			maxtotal=max1;
            middle=max2;
            min=Math.min(num3,num1);
		}
		System.out.println( maxtotal + " > "+middle+" > " +min);
		
	}
}
