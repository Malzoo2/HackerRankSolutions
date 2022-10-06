package com.abdelaal;

public class Singleton {

	public String str;
	private Singleton () {}
	
	public static Singleton getSingleInstance () {
		return new Singleton();
	}

}
