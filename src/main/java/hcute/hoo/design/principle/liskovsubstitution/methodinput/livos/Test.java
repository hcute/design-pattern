package hcute.hoo.design.principle.liskovsubstitution.methodinput.livos;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap mp = new HashMap();
        child.test(mp);
    }
}
