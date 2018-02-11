import org.junit.*;
import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
       PruebaJava p=new PruebaJava();
       assertEquals(p.p(),1);
    }
}