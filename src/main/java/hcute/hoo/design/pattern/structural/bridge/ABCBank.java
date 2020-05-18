package hcute.hoo.design.pattern.structural.bridge;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开了中国银行的账号");
        account.openAccount();
        return account;
    }
}
