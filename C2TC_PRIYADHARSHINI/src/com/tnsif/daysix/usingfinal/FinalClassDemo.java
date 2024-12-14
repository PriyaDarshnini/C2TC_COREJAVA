package com.tnsif.daysix.usingfinal;

final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass();
		f1.show();
	}
}
