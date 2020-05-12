package hcute.hoo.design.principle.liskovsubstitution.methodinput.nonlivos;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.test(hashMap);
    }
}
