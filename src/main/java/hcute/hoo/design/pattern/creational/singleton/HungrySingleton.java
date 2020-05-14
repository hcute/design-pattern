package hcute.hoo.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式 类加载的时候构造对象
 */
public class HungrySingleton implements Serializable {

//    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    // final 修饰的类必须在类初始化的时候完成赋值
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        // 解决反射的问题
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 防止反射的时候新建对象，破坏单例子
     * @return
     */
    public Object readResolve(){
        return hungrySingleton;
    }
}
