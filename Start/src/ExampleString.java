
public class ExampleString 
{
	public static void main(String[] args)
	{
		String a="upesh";
		String b="upesh";
		String e="UPESh";
		
		String c = new String("datta");
		String d = new String("datta");
		
		String f ="pw";
		String g ="pw"+"skills"+100;
		String h =c+d+f+g;
		//comparing the references of String objects
		System.out.println(a==b);
		System.out.println(c==d);
		
		//comparing the data of Strings
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(a.equals(e));
		
		//ignores the case of the String 
		System.out.println(a.equalsIgnoreCase(e));
		
		System.out.println(g);
		System.out.println(h);
		
		for(int i=0;i<a.length();i++)
		{
			System.out.println(a.charAt(i));
		}
		
		System.out.println(g.toUpperCase());
		System.out.println(e.toLowerCase());
		
		//Substring
		
		System.out.println(a.substring(2, 4));
		
		//index number
		
		System.out.println(a.indexOf("e"));
		System.out.println(c.lastIndexOf("a"));
		
		String s= "Hello world";
		s.trim();

		int i = s.indexOf(" "); 

		System.out.println(i);
		
		
	}
}
