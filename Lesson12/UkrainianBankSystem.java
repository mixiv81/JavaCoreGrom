package Lesson12;

public class UkrainianBankSystem implements BankSystem {
    @Override
    public void withdraw(User user, int amount) {

        if (!checkWithdraw(user, amount))
            return;

        user.setBalance(user.getBalance() - amount - user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        if (amount > user.getBank().getLimitOfFunding()) {
            System.err.println("Cant't fund money " + amount + " to user" + user.toString());
        }
       else
            user.setBalance(user.getBalance() + amount - user.getBank().getCommission(amount));
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if (!checkWithdraw(fromUser, amount) && checkFundLimit(toUser, amount))
            return;
        withdraw(fromUser, amount);

        fund(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());

    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal())
                && checkWithdrawLimits(user, amount, user.getBalance());

    }


    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private boolean checkFundLimit(User user, int amount) {
        if (amount > user.getBank().getLimitOfFunding()) {
            System.err.println("Cant't fund money " + amount + " to user" + user.toString());
            return false;
        }
        return true;
    }
}