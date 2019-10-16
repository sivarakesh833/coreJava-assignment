package com.cg;

public class ComplexNumber 
{
   double real;
   double img;
   
   public ComplexNumber(double real, double img) {
	super();
	this.real = real;
	this.img = img;
}

public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
   {
  	 ComplexNumber temp=new ComplexNumber(0, 0);
  	 temp.real=c1.real+c2.real;
  	 temp.img=c1.img+c2.img;
  	 return temp;
	   
   }
public static ComplexNumber substract(ComplexNumber c1,ComplexNumber c2)
{
	ComplexNumber temp1=new ComplexNumber(0,0);
	temp1.real=c1.real-c2.real;
	temp1.img=c1.img-c2.img;
	return temp1;
	
}

public static ComplexNumber product(ComplexNumber c1,ComplexNumber c2)
{
	
	ComplexNumber temp2=new ComplexNumber(0,0);
	temp2.real=c1.real*c2.real;
	temp2.img=c1.img*c2.img;
	return temp2;
	
}

public static ComplexNumber swap(ComplexNumber c1,ComplexNumber c2) 
{
	ComplexNumber temp3=new ComplexNumber(0,0);
	temp3.real=c1.real;
	 c1.real=c2.real;
	 c2.real=temp3.real;
	 temp3.img=c1.img;
	 c1.img=c2.img;
	 c2.img=temp3.img;
	 System.out.println("swapped numbers are :"+" "+c1.real+"+"+c1.img+"i"+" & "+c2.real+"+"+c2.img);
	return temp3;
}
	public static void main(String[] args) 
	{
		ComplexNumber c1 = new ComplexNumber(9, 9);
		ComplexNumber c2 = new ComplexNumber(8, 8);
	
		//Adding a two numbers
		ComplexNumber temp = sum(c1, c2);
	    System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
	    
	    //Substracting a two Numbers
	    
	    ComplexNumber temp1=substract(c1,c2);
	    System.out.println("Substract is: "+ temp1.real+" - "+ temp1.img +"i");

	//product of two numbers
	    ComplexNumber temp2=product(c1,c2);
	    System.out.println("Substract is: "+ temp2.real+" *"+ temp2.img +"i");

	    //swap two numbers
	    
	    ComplexNumber temp3=swap(c1,c2);
	    System.out.println("Swap two number:"+temp3.real+":"+temp3.img+"i");
	    
	    
		
	}

}
