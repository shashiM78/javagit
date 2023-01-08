package javabasiccode;

public class reversestring {
	public static void main(String[] args) {
		
	/*
	 * Write a Java code to reverse a String
	 */
		
String  a = "Ajay";
String b = "Shashi";
String c = "bangalore";		


StringBuilder st = new StringBuilder(a);
StringBuilder at =  new StringBuilder(b);
StringBuilder bt = new StringBuilder(c);
st.reverse();
at.reverse();
bt.reverse();
System.out.println(st);
System.out.println(at);
System.out.println(bt);

	}


}


