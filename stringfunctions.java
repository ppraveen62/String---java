  package demo;

public class stringfunctions {

	public static void main(String[] args) {
		String var1= "string functions program";
		String var2= "string functions";
		
		System.out.println("string operations are");
		
		System.out.println(var1.charAt(1));
		
		System.out.println(var1.codePointAt(3));//unicode
		
		System.out.println(var1.codePointBefore(1));
		
		System.out.println(var1.codePointCount(0, 5));//
		
		System.out.println(var1.compareTo(var2));//8
		
		System.out.println(var1.compareToIgnoreCase(var2));//
		
		System.out.println(var1.concat(var2));
		
		System.out.println(var1.contains(var2));
		
		System.out.println(var1.contentEquals(var2));
		
		System.out.println(var1.contentEquals(var2));
		
		System.out.println(var1.endsWith(var2));
		
		System.out.println(var1.equals(var2));
		
		System.out.println(var1.equalsIgnoreCase(var2));
		
		System.out.println(var1.hashCode());
		
		System.out.println(var1.indent(0));
		
		System.out.println(var1.indexOf(0));
		
		System.out.println(var1.indexOf(var2));
		
		System.out.println(var1.indexOf(0, 0));
		
		System.out.println(var1.indexOf(var2, 0));
		

		
		
		
		

	}

}
