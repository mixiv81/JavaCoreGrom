package Lesson5;

public class WithdrawalFromBalances {

    public int withdraw(String[] clients, int[] balances, String client, int amount) {
        int clIndex = 0;
        for (String el : clients) {
            if (el == client && el != null) {
                break;
            }
            clIndex++;
        }
            int withDrawlFromBalance = balances[clIndex] >= amount ? balances[clIndex] - amount : -1;
            return withDrawlFromBalance;

    }
}
