package com.java8.lambdaExpression;

public class ClassC {

	interface FuncInterface1 {
		int operation(int a, int b);
	}
	
	interface FuncInterface2 {
		void sayMessage(String msg);
	}
	
	private int operate(int a, int b, FuncInterface1 fobj) {
		return fobj.operation(a, b);
	}
	
	public static void main(String[] args) {
		FuncInterface1 add = (int a, int b) -> a + b;
		FuncInterface1 multiply = (int a, int b) -> a * b;
		
		ClassC obj = new ClassC();
		
		System.out.println("Addition = " + obj.operate(4, 5, add));
		
		System.out.println("Multiplication = " + obj.operate(4, 5, multiply));
		
		FuncInterface2 msg = message -> System.out.println("Hi " + message);
		msg.sayMessage("all");
	}
}