package ch.hesge.cours634.counter;

public class CounterException extends Exception {
    private String message;
    public CounterException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
