package homework11Kramarenko;

public class AccountCreating {
    public static void main(String[] args) {

        Account account = new Account("Yuliia", 1992, 12, 30, "bla@bla", 1234, "Kramarenko", 65, 120,1000);
        account.countAge();
        account.printAccountInfo();

        Account account1 = new Account("Vasya", 1991, 12, 30, "bla1@bla", 1234, "Petrenko", 65, 120,2000);
        account1.countAge();
        account1.setSteps(5000);
        account1.printAccountInfo();

        Account account2 = new Account("Kate", 1995, 12, 30, "bla2@bla", 1234, "Kuzko", 65, 120,3000);
        account2.countAge();
        account2.setWeight(60);
        account2.setSurname("NewKuzko");
        account2.printAccountInfo();
    }
}
