package hcute.hoo.design.pattern.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        User hooray = new User("hooray");
        User geely = new User("geely");
        hooray.sendMessage("hello geely");
        geely.sendMessage("how are you");

    }
}
