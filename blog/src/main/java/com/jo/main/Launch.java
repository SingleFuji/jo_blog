package com.jo.main;

public class Launch {

	public static void main(String[] args) {
		String classpath = Thread.currentThread().getContextClassLoader().getResource("").toString();
		System.out.println(classpath);
	}
}
