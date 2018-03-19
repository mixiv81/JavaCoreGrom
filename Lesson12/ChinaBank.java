package Lesson12;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD)
            return 100;
        else
            return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR)
            return 5000;
        else
            return 10000;
    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency() == Currency.USD)
            return 0.01;
        else
            return 1;
    }

    @Override
    public double getCommission(int amount) {
        if (getCurrency() == Currency.USD){
            if (amount <= 1000)
                return amount * 0.03;
            else
                return amount * 0.05;
        }else {
            if (amount<=1000)
                return amount * 0.1;
            else
                return amount * 0.11;
        }
    }
}