package Conditional_Stat;

public class Switch_Case {

	String monthname;
	public void month(int month)
	{
		
		switch(month)
		{
		case 1:
			monthname="January";
			break;
		case 2:
			monthname="Feb";
			break;
		case 3:
			monthname="March";
			break;
		case 4:
			monthname="April";
			break;
		case 5:
			monthname="May";
			break;
		case 6:
			monthname="June";
			break;
		case 7:
			monthname="July";
			break;
		case 8:
			monthname="August";
			break;
		case 9:
			monthname="September";
			break;
		case 10:
			monthname="October";
			break;
		case 11:
			monthname="November";
			break;
		case 12:
			monthname="December";
			break;
		default:
			System.out.println("invalid month number");
		}
		
		System.out.println(monthname);
	}
	
	public static void main(String[] args)
	{
		Switch_Case obj= new Switch_Case();
		obj.month(-1);
	}
}
