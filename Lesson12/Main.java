package Lesson12;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(1222, "Sweden", Currency.USD, 100, 1400, 4, 444344343);
        Bank euBank = new EUBank(2311, "Italy", Currency.EUR, 150, 1500, 5, 87656254);
        User user = new User(1001, "Denis", 12200, 40, "GMD", 1500, euBank);
        User user1 = new User(1002, "Ann", 10000, 40, "GMD", 1500, usBank);

        BankSystem bankSystem = new UkrainianBankSystem();

//        System.out.println(user.getBalance());
//        System.out.println(user1.getBalance());
//        bankSystem.withdraw(user, 22000);
//        System.out.println(user.getBalance());
//        bankSystem.fund(user, 25000);
//        System.out.println(user.getBalance());
//
//////
        System.out.println();
        bankSystem.transferMoney(user, user1, 25000);
        System.out.println(user.getBalance());
        System.out.println(user1.getBalance());
//        System.out.println();
//        bankSystem.paySalary(user);
//        System.out.println(user.getBalance());
    }

}
