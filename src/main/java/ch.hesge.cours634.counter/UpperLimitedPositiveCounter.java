package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int value = getValue();
    private int maxValue;

    public UpperLimitedPositiveCounter(int val, int maxValue) {
        super(val);
        this.maxValue = maxValue;
    }

    @Override
    public void inc() throws CounterException {
        if (value + 1 > maxValue){
            throw new CounterException("Limite dépassée");
        }else{
            value++;
        }
    }

    @Override
    public void add(int step) throws CounterException {
        if (value + step > maxValue){
            throw new CounterException("Limite dépassée");
        }else {
            value += step;
        }
    }

    @Override
    public int getValue() {
        return value;
    }

}
