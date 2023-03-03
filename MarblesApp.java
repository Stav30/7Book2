/** 1- Use scanner to obtain values of variables: numberOfMarbles and numberOfChildren
*
*/

import java.util.Scanner;
public class MarblesApp
{
	
	public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	
		// declarations for method/local variables
		int numberOfMarbles;
		int numberOfChildren;
		int marblesPerChild;
		int marblesLeftOver;	
	

// get the input data
System.out.println("Welcome to the marble divvy-upper.");
System.out.print("Number of marbles: ");
numberOfMarbles = sc.nextInt();
System.out.print("Number of Children: ");
numberOfChildren = sc.nextInt();

// calculate results 
marblesPerChild = numberOfMarbles / numberOfChildren ;
marblesLeftOver = numberOfMarbles % numberOfChildren ;

// print results 
System.out.println("Give each child " + marblesPerChild + " marbles.");
System.out.println("You will have " + marblesLeftOver + " marbles left over.");

}
}

