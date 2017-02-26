import org.junit.Assert;
import org.junit.Test;

/**
 * Created by james on 2/23/17.
 */
public class PrimeLocatorTest {
    @org.junit.Test
    public void primeNum() throws Exception {

    }

    @Test
    public void test5() throws Exception {
        Assert.assertEquals(5, PrimeLocator.primeNum(new int[]{5}));
    }

    @Test
    public void test11() throws Exception {
        Assert.assertEquals(11, PrimeLocator.primeNum(new int[]{11}));
    }

    @Test
    public void test29() throws Exception {
        Assert.assertEquals(29, PrimeLocator.primeNum(new int[]{10}));
    }

    @Test
    public void test41() throws Exception {
        Assert.assertEquals(41, PrimeLocator.primeNum(new int[]{13}));
    }

    @Test
    public void test59() throws Exception {
        Assert.assertEquals(59, PrimeLocator.primeNum(new int[]{17}));
    }

}