package ATM;

import java.util.ArrayList;

/**
 * Created by alex on 14.31.3.
 */
public class CashBox {

    private int cashSum;

    private ArrayList<Money> box = new ArrayList<Money>();

    public void addMoney(int denomination, int quantity) {
        Money cash = new Money(denomination, quantity);
        box.add(cash);
        System.out.println("Cash added. " + quantity + " of " + denomination + " EUR.");
        showMoney();
    }

    public void showMoney() {
        for (Money m : box) {
            m.toString();
        }
    }

    public void setCashSum() {
        for (Money m : box) {
            this.cashSum = this.cashSum + (m.getDenomination() * m.getQuantity());
        }
    }

    public int getCashSum() {
        return cashSum;
    }

    public void giveMoneyFixedAmount(int clientChoice) {
        int sum = clientChoice;
        for (Money m : box) {
            if (sum == m.getDenomination()) {
                if (m.getQuantity() > 0) {
                    System.out.println("Please take money - " + sum + " EUR.");
                }
            }
        }
    }

}