package BasicJava;

public class Student {
	
	int rollno=10;
	String name="feg";
	static String schoolname="ABC";
	
	public Student(int r,String n,String sn)
	{
		schoolname = sn;
		rollno=r;
		name=n;
	}
	
	public void display()
	{
		System.out.println(rollno+" "+name+" "+schoolname);
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student(101,"Mahesh","DEF");
		Student s2= new Student(102,"Ramya","GHI");
		
     //   Student.schoolname="XYZ";
		
		System.out.println(s1.rollno);
		System.out.println(s2.rollno);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		
		System.out.println(s1.schoolname);
		System.out.println(s2.schoolname);
		
		
		
	
	}

}
