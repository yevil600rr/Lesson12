package by.htp.yevil.runner;

public class Task4 {
// ¬ тексте после k-го символа вставить заданную подстроку.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder s1 = new StringBuilder();
String s2 = new String();
s1.append("–еволюц€");
s2= "и";
StringBuilder s3 = new StringBuilder();
s3= s1.insert(s1.length()-1, s2);
System.out.println(s3);

	}

}
 