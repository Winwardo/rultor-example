package rultor.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTests {

    @Test
    public void CalculatorAddSimple() {
	Calculator calculator = new Calculator();
	assertEquals(12, calculator.add(5, 7));
    }

    @Test
    public void CalculatorAddLargeNumbers() {
	Calculator calculator = new Calculator();
	assertEquals(12000, calculator.add(5000, 7000));
    }

    @Test
    public void CalculatorMultiplySimple() {
	Calculator calculator = new Calculator();
	assertEquals(56, calculator.add(7, 8));
    }
}
