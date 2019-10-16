package com.cg;

public class Date {
	int day;
	String month;
	int year;

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printDate() {
		System.out.println("day" + ":" + day + " " + "month" + ":" + month + " " + " " + "year" + ":" + year);
	}

	public static void swap(Date dv, Date dv1) {
		Date temp = dv;
		dv = dv1;
		dv1 = temp;
		dv.printDate();
		dv1.printDate();
	}

	public static void main(String[] args) {
		Date dv = new Date(16, "August", 2010);
		dv.printDate();
		Date dv1 = new Date(22, "march", 2019);
		dv1.printDate();
		System.out.println(" ");
		System.out.println("The swapped dates are:");
		swap(dv, dv1);

	}

}
