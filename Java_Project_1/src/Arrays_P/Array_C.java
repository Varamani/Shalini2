package Arrays_P;

public class Array_C {
	
	int arr[] = new int[5];
	
	public void display()
	{
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		System.out.println("Array length is : " + arr.length);
		
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args)
	{
		Array_C obj= new Array_C();
		obj.display();
	}

}
