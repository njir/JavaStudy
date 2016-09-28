import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by tak on 16. 9. 24.
 */
public class StringCalculatorTest {
    private StringCalculator cal;

    @Before
    public void setup(){
        cal = new StringCalculator();
        System.out.println("Start StringCalculator");
    }

    @Test
    public void checkNull(){
        System.out.println("Start checkNull");
        Assert.assertEquals(0, cal.add(""));
        Assert.assertEquals(0, cal.add(null));
    }

    @Test
    public void checkSingleNum(){
        System.out.println("Start checkSingleNum");
        Assert.assertEquals(2, cal.add("2"));
        Assert.assertEquals(4, cal.add("4"));
    }

    @Test
    public void checkDualNum(){
        System.out.println("Start checkDualNum");
        Assert.assertEquals(6, cal.add("2,4"));
        Assert.assertEquals(14, cal.add("4,10"));
    }

    @Test
    public void checkSpliter(){
        System.out.println("Start checkSpliter");
        Assert.assertEquals(new String[] {"1", "2"}, cal.spliter("1,2"));
        Assert.assertEquals(new String[] {"1", "2", "3"}, cal.spliter("//;\n1;2;3"));
    }
    @Test
    public void checkString(){
        System.out.println("Start checkString");
        Assert.assertEquals(6, cal.add("1,2:3"));
        Assert.assertEquals(5, cal.add("1:2:2"));
    }

    @After
    public void clean(){
        cal = null;
    }
}
