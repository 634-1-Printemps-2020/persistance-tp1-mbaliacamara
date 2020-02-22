package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int val;

    public Counter(int val) {
        this.val = val;
    }

    @Override
    public void inc() throws CounterException {
        val++;
    }

    @Override
    public void add(int step) throws CounterException {
        val += step;
    }

    @Override
    public int getValue() {
        return val;
    }
}
