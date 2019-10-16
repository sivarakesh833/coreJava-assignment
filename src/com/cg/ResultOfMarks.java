package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ResultOfMarks {
static Scanner scanner=null;
static double sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		scanner=new Scanner(System.in);
		/*System.out.println("enter the no of marks you want:- ");
		int j=scanner.nextInt();*/
		ArrayList<Integer> arrayList=new ArrayList<>(3);
		System.out.println("enter 3 subjects  marks:- ");
		for(int i=0;i<3;i++) {
			arrayList.add(scanner.nextInt());
	      }
		for (Integer integer : arrayList) {
			if(integer>60) {
				count++;
			}
		}
		if(count==arrayList.size())
		System.out.println("All subject marks are greater than 60 and so passed.");
		if(count<arrayList.size()&&count>=2)
			System.out.println(count+" subject marks are greater than 60 and so promoted.");
		if(count<2||count==0)
			System.out.println("only "+count+" subject marks are greater than 60 and failed.");
	}
}
