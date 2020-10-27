/**
  Author : Jayakrishna
  date :   25/10/2020
  desc :   SumIntegers
  */

import java.util.*;
public class SumIntegers {

	public static void main(String[] args) {
		
		int number;
		int sum=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringTokenizer st=new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			number=Integer.parseInt(temp);
			System.out.println(number);
			sum=sum+number;
		}
        System.out.println("sum:"+sum);
        s.close();
	}

}