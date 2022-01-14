package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Положить деньги на счет " + sum);
    }
    public void withDraw(double sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("Не хвотает денег на счету ", amount);
        }else {amount -= sum;
            System.out.println("Вы сняли деньги " + sum);}

    }
}
