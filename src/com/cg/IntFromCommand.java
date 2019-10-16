package com.cg;

import java.util.ArrayList;
import java.util.Arrays;

public class IntFromCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Integer> arrayList=new ArrayList<Integer>();
		int args1[]=new int[args.length];
		if(args1.length>0) {
		System.out.println("number of command line arguments given:- "+args1.length);
		for (int i =0;i<args.length;i++) {
			args1[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Given command args are:- ");
		for (int i : args1) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("Given command args in sorted order are:- ");
		Arrays.sort(args1);
		for (int i : args1) {
			System.out.print(i+" ");
		}
		}
		else {
			System.out.println("no command line arguments are given");
		}
		}
		catch(NumberFormatException exception) {
			System.out.println("Please give integer only as command lines.");
		}
	}
}
