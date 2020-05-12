package hcute.hoo.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

public class Child extends Base {

    @Override
    public HashMap test() {
        HashMap hs = new HashMap();
        System.out.println("子类方法被执行");
        hs.put("message","子类方法被执行");

        return hs;
    }
}
