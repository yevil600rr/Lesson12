package by.htp.yevil.runner;
import java.util.Scanner;
public class Task1 {  
//В каждом слове текста k-ю букву заменить заданным символом.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Строка: ");
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
		
        int k=s.nextInt();
        String temp;
        String []words=str.split(" ");
        for(int l=0;l<words.length;l++){
            System.out.print("");
 
            if(k<words[l].length()){
                temp="";
                temp+=words[l].substring(0, k-1);
                temp+='1';
                temp+=words[l].substring(k,words[l].length());
 
                words[l]=temp;
            }
            System.out.print(" "+words[l]);
        }
	}

}
