package com.demo.basic;
import java.util.Scanner;
public class PositiveNegativeNumber {
	public static void main(String[]args) {
		int n;
		System.out.println("Enter the number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n>0)
		{
			System.out.println("The number is the positive Number");
		}
		else if(n<0)
		{
			System.out.println("The Num is negative number");
			
		}
		else
		{
			System.out.println("The number is neither positive nor negative5");
		}
		
	}

}
