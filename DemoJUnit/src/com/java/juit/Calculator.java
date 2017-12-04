package com.java.juit;

public class Calculator {
	CalculatorService service;

	/*
	 * public int add(int i, int j) { return i + j; }
	 */

	/*
	 * public int add(int i,int j) // (i+j) -->addition { return service.add(i,
	 * j); }
	 */

	// create a constructor for Calculator
	public Calculator(CalculatorService service) {

		this.service = service;
	}

	public int perform(int i, int j) // 2,3->i.e.(i+j)*i-->(2+3)*2 -->expecting
										// output
	{
		return service.add(i, j) * i;
	}

}
