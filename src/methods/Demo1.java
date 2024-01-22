package methods;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1="Hello World";
		String s2="Well Java come to Java to";
		String s3="Java";
		char ch='J';
		char ch2='a';
		
		System.out.println(s1.indexOf('l'));
		
		System.out.println(s2.charAt(8));
		
		System.out.println(s2.indexOf('t', 2));
		
		System.out.println(s2.lastIndexOf('e'));
		
		System.out.println(s2.lastIndexOf(s1));
		
		System.out.println(s2.lastIndexOf('e',8));
		
		System.out.println(s2.lastIndexOf("l"));
		
		System.out.println(s2.lastIndexOf(ch,24));

		
}
}
