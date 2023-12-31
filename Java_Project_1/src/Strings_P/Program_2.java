package Strings_P;

public class Program_2 {
	
	String n= "KarIMulLa123@##$qwer12334";
	String digits="";
	String alphabets="";
	String splChars="";
	
    public void dispaly()
    {
    	 for(int i=0;i<=n.length()-1;i++)
    	 {
    		 char c= n.charAt(i);
    		 
    		 if(Character.isDigit(c))
    		 {
    			 digits = digits+c;
    		 }
    		 else if(Character.isAlphabetic(c))
    		 {
    			 alphabets = alphabets+c;
    		 }
    		 else
    		 {
    			 splChars = splChars+c;
    		 }
    	 }
    	 
    	 System.out.println(alphabets);
    	 System.out.println(digits);
    	 System.out.println(splChars);
    }
	
    public static void main(String[] args)
    {
    	Program_2 obj = new Program_2();
    	obj.dispaly();
    }

}
