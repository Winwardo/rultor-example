package rultor.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

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
	assertEquals(56, calculator.multiply(7, 8));
    }

    @Test
    public void CalculatorDivideSimple() {
	Calculator calculator = new Calculator();
	assertEquals(6, calculator.divide(24, 4));
    }
}
