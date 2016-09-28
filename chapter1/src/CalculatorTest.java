/**
 * Created by tak on 16. 9. 24.
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setup(){
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add(){
        Assert.assertEquals(9, cal.add(6, 3));
        System.out.println("add");
    }

    @Test
    public void subtract(){
        Assert.assertEquals(3, cal.subtract(6, 3));
        System.out.println("subtract");
    }

    @After
    public void teardown(){
        System.out.println("teardown");
    }
}
