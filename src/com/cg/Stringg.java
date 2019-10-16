package com.cg;

public class Stringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "rakesh" + new String("rakesh");
		String name1 = new String("rakesh");
		System.out.println(name == name1);
		System.out.println(name.equals(name1));
		System.out.println("==============");
		String name2 = "rakesh";
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		System.out.println("==============");
		String name3 = new String("rakesh");
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3));
	}
}
