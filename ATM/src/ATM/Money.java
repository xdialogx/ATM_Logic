package ATM;

public class Money {

    private int denomination;
    private int quantity;

    public Money(int denomination, int quantity) {
        this.denomination = denomination;
        this.quantity = quantity;
    }

    public int getDenomination() {
        return denomination;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money money = (Money) o;

        if (denomination != money.denomination) return false;
        if (quantity != money.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = denomination;
        result = 31 * result + quantity;
        return result;
    }

    @Override
    public String toString() {
        return "Money{" +
                "denomination=" + denomination +
                ", quantity=" + quantity +
                '}';
    }
}