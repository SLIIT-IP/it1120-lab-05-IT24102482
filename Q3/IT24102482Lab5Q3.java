import java.util.Scanner;
public class IT24102482Lab5Q3
{
	public static void main(String[] args)
{
	int Start_day, End_day, Total_days;
	double Charge_per_day = 48000.00;
	double Total_amount, discount=0;

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the start day: ");
	Start_day = sc.nextInt();

	if(Start_day>=1 && Start_day<=31)
	{
		System.out.print("Enter the end day: ");
		End_day = sc.nextInt();
	


	if(End_day>=1 && End_day<=31)
	{
		Total_days = End_day - Start_day;
	
	

		System.out.println("Room charge per day is: " + Charge_per_day);	
		System.out.println("Number od days reserved: "+ Total_days);

		if(Total_days>=5)
			discount=0;

		if(Total_days==3 || Total_days==4)
			discount= (Charge_per_day * Total_days) * 10/100;

		if(Total_days>=5)
			discount= (Charge_per_day * Total_days) * 20/100;

		Total_amount = Charge_per_day - discount;

		System.out.println("Total amount to be paid:" + Total_amount);
	}
		else
			System.out.println("Error:Invalid Start date");
	}
		else
			
			System.out.println("Error:Invalid End date");
		
					
}
}
		
		




