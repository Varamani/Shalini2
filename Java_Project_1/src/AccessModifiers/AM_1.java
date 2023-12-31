package AccessModifiers;

public class AM_1 {
	
	/*access Modifiers : private,protected,public,default
	 * 
	 * class
	 * methods
	 * variables
	 * constructors
	 * blocks
	 * 
	 */
	
	private void private_method()
	{
		System.out.println("This is private method");
	}
	
	protected void protected_method()
	{
		System.out.println("This is protected method");
	}
	
	public void public_method()
	{
		System.out.println("This is public method");
	}
	
	void default_method()
	{
		System.out.println("This is default method");
	}
	
	public static void main(String[] args)
	{
		AM_1 obj= new AM_1();
		obj.private_method();
		obj.protected_method();
		obj.public_method();
		obj.default_method();
	}

}
