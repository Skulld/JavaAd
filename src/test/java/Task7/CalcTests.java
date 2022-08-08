package Task7;

import Task6.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTests {

@Test
   public void resultAddition() throws Exception {
        Calculator.Expression testExpression = new Calculator.Expression(3, '+' , 2);
    Double result = testExpression.calculate();
        assertEquals(new Double(5), result);
    }

@Test
    public void resultSubtraction() throws Exception {
        Calculator.Expression testExpression = new Calculator.Expression(7, '-' , 9);
        Double result = testExpression.calculate();
        assertEquals(new Double(-2), result);
    }

@Test
    public void resultMultiplicaion() throws Exception {
        Calculator.Expression testExpression = new Calculator.Expression(-3, '*' , 3);
        Double result = testExpression.calculate();
        assertEquals(new Double(-9), result);
    }

@Test
    public void resultDivision() throws Exception {
        Calculator.Expression testExpression = new Calculator.Expression(-3, '/' , 3);
        Double result = testExpression.calculate();
        assertEquals(new Double(-1), result);
    }

@Test(expected = ArithmeticException.class)
    public void DivisionByZero() throws Exception {
        Calculator.Expression testExpression = new Calculator.Expression(-3, '/' , 0);
        Double result = testExpression.calculate();
    }

}
