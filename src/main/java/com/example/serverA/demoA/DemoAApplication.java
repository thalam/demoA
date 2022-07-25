package com.example.serverA.demoA;


public class DemoAApplication {

	public static void main(String[] args)
	{
		// parameter ch
		char ch = 'a';
		// assigns character values
		Character c = Character.valueOf(ch);


		// assign hashcodes of c1, c2 to i1, i2
		int i = c.hashCode();

		// prints the character values
		System.out.println("Hashcode of " + ch + " is " + i);
		// b - 98
		// B - 66
		// a - 97
		// A - 65
	}

	public int hashmap(){
		return 1;
	}
}
