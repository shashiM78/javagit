package javabasiccode;

public class reversestring {
	public static void main(String[] args) {
		
	/*
	 * Write a Java code to reverse a String
	 */
		
String  a = "Ajay";
String b = "Shashi";


StringBuilder st = new StringBuilder(a);
StringBuilder at =  new StringBuilder(b);
st.reverse();
at.reverse();
System.out.println(st);
System.out.println(at);

	}


}


