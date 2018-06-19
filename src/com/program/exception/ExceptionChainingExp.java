package com.program.exception;

public class ExceptionChainingExp {

	public static void main(String[] args) {
		System.out.println("Start");
		test1();
		System.out.println("main -end");
	}

	static void test1() {

		System.out.println("test1()");
		test2();
		System.out.println("1 end");
	}

	static void test2() {
		System.out.println("test2()");
		test3();
		System.out.println("2 end");
	}

	static void test3() {
		System.out.println("test3()");
		test4();
		System.out.println("3 end");
	}

	static void test4() {
		System.out.println("test4()");
		try{
			int i = 10/0;
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("4 end");
	}
}
