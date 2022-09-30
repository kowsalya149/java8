package com.java8.lambdaExpression;

interface FuncInterface {

	void abstractfunc(int x);
	
	default void normfunc() {
		System.out.println("Hi");
	}
}

public class ClassB {
	
	public static void main(String[] args) {
		
		FuncInterface func = (int x) -> System.out.println(2 * x);
		func.abstractfunc(4);
	}
}