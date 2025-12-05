package rvt;


public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;

    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if(balance >= 2.60) {
            balance = balance - 2.60;
        }
        else {
            balance = balance;
        }

    }

    public void eatHeartily() {
        if(balance >= 4.60) {
            balance = balance - 4.60;
        }
        else {
            balance = balance;
        }
    }

    public void addMoney(double amount) {
    balance = balance + amount;
    if(balance > 150) {
        balance = 150;
    }
    if (amount < 0) {
        balance = balance - amount;
    }

    }
    
}
