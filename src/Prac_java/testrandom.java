package Prac_java;

import java.util.Random;

public class testrandom {
	public long generateID() {
		Random rnd = new Random();
		char[] digits = new char[10];
		digits[0] = (char) (rnd.nextInt(9) + '1');
		for (int i = 1; i < digits.length; i++) {
			digits[i] = (char) (rnd.nextInt(10) + '0');
		}
		return Long.parseLong(new String(digits));
	}


	public static void main(String[] args) {
		
		testrandom tstrm = new testrandom();
		long a = tstrm.generateID();
		System.out.println(a);
              
	}

}
