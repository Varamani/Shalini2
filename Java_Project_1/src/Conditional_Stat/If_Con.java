package Conditional_Stat;

public class If_Con {
	
	
	public void ele(char c)
	{
		
		if(c=='a' || c == 'e' || c=='i' || c=='o' || c=='u'  )
		{
			System.out.println("the charcter is vowel");
		} else  
		{
			System.out.println("The charcter is Consonant");
		}
			
	}
	public static void main(String[] args)
	{
		If_Con obj = new If_Con();
		obj.ele('e');
	}

}
