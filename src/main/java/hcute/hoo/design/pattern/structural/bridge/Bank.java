package hcute.hoo.design.pattern.structural.bridge;

public abstract class Bank {
    // 存在一个组合关系的类
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
