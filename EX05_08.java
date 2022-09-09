import java.util.Scanner;
public class EX05_08 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter 4 degrees in fahrenheit");
System.out.print("Fahrenheit");
System.out.print("               ");
System.out.println("Celsius");
for(int i = 1; i<=4;i++){
double x1 =input.nextDouble();
System.out.print(x1);
System.out.print("               ");
System.out.println(fahrenheitToCelsius(x1));
}
System.out.println("enter 4 degrees in celsius");
System.out.print("celsius");
System.out.print("               ");
System.out.println("fahrenheit");
for(int j = 1; j<=4;j++){
double x2 =input.nextDouble();
System.out.print(x2);
System.out.print("               ");
System.out.println(celsiusToFahrenheit(x2));
}






}
	
public static double fahrenheitToCelsius(double fahrenheit) {
	double celsuis = (fahrenheit-32.0)/(9.0/5.0);
	return celsuis;

}
public static double celsiusToFahrenheit(double celsius){
     double fahrenheit=(9.0/5.0)*celsius+32;
     return fahrenheit;
}
}
