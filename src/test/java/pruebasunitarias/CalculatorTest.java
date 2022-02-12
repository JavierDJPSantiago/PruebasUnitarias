package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
//llamamos al metodo: viene en la documentacion

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	//creando objeto de clase Calculator
	private final Calculator calculator = new Calculator();
	//objeto privado porque solo lo usaremos aqui
	
	
	
	//@Test: es para decir que hacemos rueba
	//addition cuando es suma
	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}	           //(dara 8, a partir de (5,3))
	//se espera que el metodo addNumbers arroje 8 al usar 5,3
	
	@Test
	void substraction() {
		assertEquals(5, calculator.subtractNumbers(8, 3));
	}	  
	
	@Test
	void divide() {
		assertEquals(2, calculator.divideNumbers(4, 2));
	}	 
	
	@Test
	void multiply() {
		assertEquals(40, calculator.multiplyNumbers(8, 5));
	}	 
	
	
}
