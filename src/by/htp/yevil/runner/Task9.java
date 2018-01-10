package by.htp.yevil.runner;

public class Task9 {
// Определить, сколько раз повторяется в тексте каждое слово, которое встре-
	//чается в нем.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.";
String[] s = str1.split(" ");
for (int i=0; i<s.length; i++) {
	String str2 = s[i];
	int x=0;
	for (int j=0; j<s.length; j++) {
		if (str2.equals(s[j])) {
			x++;
		}
	}
	System.out.println("Слово '"+s[i]+ "' встречается "+x+" раз(a)");
}
	}

}
