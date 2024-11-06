// Program to demonstrate final Variable
package tns.ifet.daysix.usingfinal;

public class FinalVariable {

	// final int x; // final instance variable must be initialized

	static int x = 0;

	// Declare a static blank final variable.
	final static int Y;

	// Declare & intialize static final variable.
	final static int Z = 10;

	// instatnce method
	static void change() {
		x = 30; // final variables can't be reassigned
		Y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		System.out.println("Value of Y: " + Y);
	}

}
