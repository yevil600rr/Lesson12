package by.htp.yevil.runner;

public class Task2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = new String("��� ��������� ����������� �������");
StringBuffer s2 = new StringBuffer();
int start, end;
String ch = "�";
start = s1.indexOf(ch);
end = s1.lastIndexOf(ch)+1;
if (start>0 && end>0 && start<end) {
	s2= new StringBuffer(s1).delete(start, end);
	System.out.println(s2);
}

	}

	}

