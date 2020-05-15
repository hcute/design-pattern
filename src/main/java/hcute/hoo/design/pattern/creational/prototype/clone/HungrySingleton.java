package hcute.hoo.design.pattern.creational.prototype.clone;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static  HungrySingleton getInstance(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

//        return super.clone();
        // 解决克隆带来的单例破坏问题
        return getInstance();
    }
}
