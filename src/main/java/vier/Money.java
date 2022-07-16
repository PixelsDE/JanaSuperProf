package vier;

public class Money {

    private int amount;


    public Money(int amount) {
        this.amount = amount;
    }

    public void error() {
        throw new RuntimeException("Error");
    }

    public int getAmount() {
        return amount;
    }

    public Money add(int amount) {
        this.amount += amount;
        return this;
    }

    public Money subtract(int amount) {
        this.amount -= amount;
        return this;
    }
}
