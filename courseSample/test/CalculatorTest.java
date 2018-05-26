
import org.junit.Test;
import ru.isuct.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testCalcAllZeros() {
        Calculator myCalc = new Calculator();
        double res = myCalc.calc(0,0,0);
        assertEquals(Double.NaN,res,0.001);
    }

    @Test
    public void testCalcAllOnes() {
        Calculator myCalc = new Calculator();
        double res = myCalc.calc(1,1,1);
        assertEquals(Double.NaN,res,0.001);
    }


    @Test
    public void testCalcDifferentAB() {
        Calculator myCalc = new Calculator();
        double res = myCalc.calc(Math.E,1,1);
        assertEquals(2.398,res,0.001);
    }


    @Test
    public void testCalctaskBSimple() {
        Calculator myCalc = new Calculator();
        ArrayList<Double> res = myCalc.taskB(Math.E,1, Arrays.asList(1.0));
        List<Double> expRes = Arrays.asList(2.398);
        for(int i=0;i<res.size(); i++){
            assertEquals(expRes.get(i),res.get(i),0.001);
        }

    }

}