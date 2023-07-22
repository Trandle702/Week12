package com.promineotech;

import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		if((a > 0) && (b > 0)) {
			return a + b;
		}else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	public int randomNumberSquared() {
		int num = getRandomInt();
		return num * num;
	}
	
	/**
	 * This method will check to see if the divisor divides into num equal
	 * 
	 * @param num the number being divide
	 * @param divisor the number doing the dividing
	 * @return will return true if divisor divides equal into num
	 */
	public boolean isDivisble(int num, int divisor) {
		return (num % divisor) == 0;
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
	
}
