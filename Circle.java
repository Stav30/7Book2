/* make a scanner object within JMM
 * 
 */

import java.util.Scanner;
public class Circle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the circle area calculator.");
		System.out.println("Enter the radius of your circle: ");
		double r = sc.nextDouble();
		double area = Math.PI * (r*r);
		System.out.println("The area is " + area);
	
	}	
		
}
