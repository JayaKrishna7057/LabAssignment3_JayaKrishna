/**
  Author : Jayakrishna
  date :   25/10/2020
  desc :   Count 
  */

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int countChar=0,countWord=0,countLine=0;
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)!=' ')
        	    countChar++;
        	if(str.charAt(i)==' ')
        		countWord++;
        	if(str.charAt(i)=='.')
        		countLine++;
        }
        System.out.println("characters:"+countChar);
        System.out.println("Words:"+(countWord+1));
        System.out.println("Lines:"+countLine);

	}

}