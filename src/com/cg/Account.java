package com.cg;

import java.util.Scanner;
public class Account {
	static Scanner scanner=new Scanner(System.in);
	private static double balance=0;
	 public void deposit() {
		 System.out.println("Deposit method");
		 System.out.println("Enter amount you want to deposit");
		 double balance1=scanner.nextDouble();
		 balance=balance+balance1;
		 System.out.println("balance1 was added and final amount is:- "+balance);
	 }
	 public void withdraw() {
		 System.out.println("withdraw method");
		 System.out.println("Enter amount you want to withdraw");
		 double balance1=scanner.nextDouble();
		 if((balance-balance1)>0) {
			 balance=balance-balance1;
		 System.out.println("balance1 was withdrwan and final amount is:- "+balance);
		 }
		 else {
			 System.out.println("we can't withdraw amount");
		 }
	 }
	 public void print() {
		 System.out.println("print method");
		 System.out.println("Total amount in balane is:- "+balance);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter any options for 1 for deposit 2 for withdraw 3 for print ");
int choice=scanner.nextInt();
Account account=new Account();
switch(choice) {
case 1:account.deposit();
break;
case 2:account.withdraw();
break;
case 3:account.print();
break;
default:
	System.out.println("Please give correct number");
	break;
}
	}
}
