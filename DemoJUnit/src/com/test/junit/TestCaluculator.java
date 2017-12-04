package com.test.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

import com.java.juit.Calculator;
import com.java.juit.CalculatorService;

public class TestCaluculator {
	Calculator c = null;
	// create fake object
	/*CalculatorService service = new CalculatorService() { -->case 2

		@Override
		public int add(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
*/
	//cloud service provide Mockito class i.e. its the responsible for test this service class
	//CalculatorService service = Mockito.mock(CalculatorService.class); //case-->3
	
	@Mock
	CalculatorService service;
	@Rule 
	public MockitoRule rule=MockitoJUnit.rule();
	
	@Before
	public void setUp() {
		// c = new Calculator();  --->test 1
		c = new Calculator(service); //-->test 2
	}

	/*
	 * @Test public void testAdd() { assertEquals(7, c.add(2, 5)); }  --->case 1
	 */
	@Test
	public void perform() {
		when(service.add(5, 2)).thenReturn(7);
		assertEquals(35, c.perform(5, 2));
		verify(service).add(5, 2);
	}
}
