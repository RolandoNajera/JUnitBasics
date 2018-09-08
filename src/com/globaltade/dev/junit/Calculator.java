package com.globaltade.dev.junit;

public class Calculator implements Subtractor, Adder {

	@Override
	public long add(long... operands) {
		long result = 0;
		for(long operand : operands) {
			result += operand;
		}
		return result;
	}

	@Override
	public long substract(long... operands) {
		long result = operands[0];
		for(int i=1; i < operands.length; i++) {
			result -= operands[i];
		}
		return result;
	}

}
