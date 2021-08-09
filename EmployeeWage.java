package Assignment1;

public class EmployeeWage {

	public static void main(String[] args) 
	{
		int maximum=1;
		int minimum=0;
		int flag=0;
		int salHour=20, fullday=8;
		int partTime=8;
		
		int  ran = (int) (Math.random()*(maximum-minimum+1)+minimum);   
		
		if(ran==1)
		{
			flag=1;
		}
		if(flag==1)
		{
			System.out.println("Employee Present");
		}
		if(flag==0)
		{
			System.out.println("Employee Absent");
		}
		int DailyWage= fullday*salHour;
		System.out.println("DailyWage is = "+ DailyWage);
		
		int PartTimeWage= partTime*salHour;
		System.out.println("PartTimeWage is = "+ PartTimeWage);
		
		int WageperMonth= fullday*20 * salHour;
		System.out.println("WageperMonth is = " + WageperMonth);
	}

}
