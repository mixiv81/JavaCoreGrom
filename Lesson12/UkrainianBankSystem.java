package Lesson12;

public class UkrainianBankSystem implements BankSystem {
    @Override
    public void withdraw(User user, int amount) {

        if (amount + user.getBank().getCommission(amount) * amount > user.getBank().getLimitOfWithdrawal()) {
            System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
            return;
        }


        if (amount + user.getBank().getCommission(amount) * amount > user.getBalance()) {
            System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
            return;
        }
    }

    @Override
    public void fund(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser) {

    }

    @Override
    public void paySalary(User user) {

    }
}
