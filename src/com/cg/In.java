package com.cg;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class In 
{
	Consumer<Integer> consumer =(z)->{System.out.println(z+1);};
	
	 Predicate<Integer> predicate =(y)->{return y>1;};
	 Supplier<String> supplier = ()->("jai telangana");
	 Function<Integer, Integer> function=(y)->
	 {
		int x= 5;
		 return x+1;
		 
	 };
	 
	 
	public static void main(String[] args) {
		In in = new In();
		in.consumer.accept(20);
		System.out.println(in.function.apply(10));
		System.out.println(in.predicate.test(20));
		System.out.println(in.supplier.get()+" ");
	}
	
}

