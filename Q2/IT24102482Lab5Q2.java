import java.util.Scanner;
public class IT24102482Lab5Q2
{
public static void main(String[] args)
{
	int num;
	String prize;

	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter the number of new members introduced:");
	num = sc.nextInt();

	if(num >= 0)
	{
		switch(num)
		{
		case 0:prize = "No prize";
		break;
		case 1:prize = "Pen";
		break;
		case 2:prize = "Umbrella";
		break;
		case 3:prize = "Bag";
		break;
		case 4:prize = "Travelling Chair";
		break;
		case 5:prize = "Headphone";
		break;
		default:prize = "Headphone";
		break;
		}
		System.out.println("Prize is a:" + prize);
		}
			else
			System.out.println("Input must be a number 0 or greater");
}
}
