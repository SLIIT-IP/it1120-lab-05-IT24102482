import java.util.Scanner;
public class IT24102482Lab5Q1
{
public static void main(String[] args)
{
	int num1,num2,num3,max,min;

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the first integer: ");
	num1 = sc.nextInt();
	
	System.out.print("Enter the second integer: ");
	num2 = sc.nextInt();

	System.out.print("Enter the third integer: ");
	num3 = sc.nextInt();

	max = num1;
	min = num1;

	//Finding the maximum number
	if(num2 > max)
		max = num2;

	if(num3 > max)
		max = num3;

	//Finding the minimum number
	if(num2 < min)
		min = num2;

	if(num3 < min)
		min = num3;

	System.out.println("User entered numbers are :" + num1 + " " + num2 + " " + num3);
	System.out.println("The Smallest number is :" + min);
	System.out.println("The Largest number is :" + max);
}
}