package Lesson5;

public class WithdrawalFromBalances {

    static int withdraw(String[] clients, int[] balances, String client, int amount) {
        int clIndex = 0;
        for (String el : clients) {
            if (el == client) {
                break;
            }
            clIndex++;
        }
        int withDrawalFromBalanc = balances[clIndex] >= amount ? balances[clIndex] - amount : -1;
        return withDrawalFromBalanc;
    }

}
