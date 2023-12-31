package ReadData;

public class ReadProperties {

	public void display() throws IllegalAccessException
	{
		
		throw new IllegalAccessException("File does not have access for everyone");
	}
	
	public static void main(String[] args) throws IllegalAccessException 
	{
		ReadProperties obj = new ReadProperties();
		obj.display();
	}
	
}
