package com.java8.lambdaExpression;

import java.util.ArrayList;

public class ClassA {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(11);
		arrList.add(22);
		arrList.add(33);
		arrList.add(14);
		arrList.add(25);
		arrList.add(36);
		
		arrList.forEach(n -> System.out.println(n));
		
		System.out.println("\nPrint even numbers");
		arrList.forEach(n -> {if(n%2 == 0) System.out.println(n);});
	}
}