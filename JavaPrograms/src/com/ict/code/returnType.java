package com.ict.code;

public class returnType {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int xyz=add(x,y);
		int z=30;
		System.out.println(xyz);
	}
	static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}


}
