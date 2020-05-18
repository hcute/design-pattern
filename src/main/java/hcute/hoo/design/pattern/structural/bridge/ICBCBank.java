package hcute.hoo.design.pattern.structural.bridge;

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开了中国工商银行的账号");
        // 委托
        account.openAccount();
        return account;
    }
}
