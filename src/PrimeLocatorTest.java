import org.junit.Assert;
import org.junit.Test;

/**
 * Created by james on 2/23/17.
 */
public class PrimeLocatorTest {

    @Test
    public void test2() throws Exception {
        Assert.assertEquals(2, PrimeLocator.primeNum(1));
    }

    @Test
    public void test11() throws Exception {
        Assert.assertEquals(11, PrimeLocator.primeNum(5));
    }

    @Test
    public void test29() throws Exception {
        Assert.assertEquals(29, PrimeLocator.primeNum(10));
    }
    @Test
    public void test41() throws Exception {
        Assert.assertEquals(41, PrimeLocator.primeNum(13));
    }

    @Test
    public void test59() throws Exception {
        Assert.assertEquals(59, PrimeLocator.primeNum(17));
    }

}