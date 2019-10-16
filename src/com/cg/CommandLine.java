package com.cg;

import java.util.Arrays;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String args1[]=new String[args.length];
if(args1.length>0) {
System.out.println("Length of Array is :- "+args1.length);
for (int i =0;i<args.length;i++) {
	args1[i]=args[i];
}
for (String i : args1) {
	System.out.println(i);
}
System.out.println("In sorted order is:- ");
Arrays.sort(args1);
for (String i : args1) {
	System.out.println(i);
}
}
else {
	System.out.println("no command line arguments are given");
}
	}
}
