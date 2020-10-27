/**
  Author : Jayakrishna
  date :   25/10/2020
  desc :   StringAlter
  */

import java.util.Scanner;
public class StringAlter {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String result=alterString(str);
        System.out.println(result);

	}

	private static String alterString(String str) {
		
	    char[] c=new char[str.length()];
        for(int i=0;i<str.length();i++)

		{
	         char j=str.charAt(i);
			 if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u'||j=='A'||j=='E'||j=='I'||j=='O'||j=='U') {
		         c[i]=j;
			 }
			 else {
				 c[i]=(char)(j+1);
		     }
		}
        String s=new String(c);
		return s;
	}

}