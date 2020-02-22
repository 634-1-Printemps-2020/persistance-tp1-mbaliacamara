package ch.hesge.cours634.counter;
import org.junit.Assert;
import org.junit.Test;

public class Main {

    public static void main(String[] args) { System.out.println("Hello World!"); }

    @Test
    public void CounterPositiveTest() throws CounterException {
        Counter c1 = new Counter(5);
        Assert.assertEquals(5,c1.getValue());

        c1.add(5);
        Assert.assertEquals(10,c1.getValue());

        c1.inc();
        Assert.assertEquals(11,c1.getValue());
    }

    @Test
    public void CounterNegativeTest() throws CounterException {
        Counter c1 = new Counter(50);
        c1.add(5);
        Assert.assertEquals(-50,c1.getValue());
    }

    @Test
    public void UpperLimitedPositiveCounterTest() throws CounterException{
        UpperLimitedPositiveCounter c1 = new UpperLimitedPositiveCounter(5, 10);
        c1.add(9);
        Assert.assertEquals(9, c1.getValue());
        c1.inc();
    }

    @Test
    public void UpperLimitedNegativeCounterTest() throws CounterException{
        UpperLimitedPositiveCounter c1 = new UpperLimitedPositiveCounter(10, 100);
        c1.add(-20);
        Assert.assertEquals(20, c1.getValue());
    }
}
