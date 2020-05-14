package hcute.hoo.design.pattern.creational.singleton;

/**
 * 静态内部类的实现方式 类加载的时候构造对象，但是带有延迟加载
 * jvm 在类初始化的时候对多线程会进行加锁
 * 类立刻初始化
 *  A的实例被创建
 *  A类的静态方法被调用
 *  A类的静态成员变量被赋值
 *  A类的静态成员（非常量成员）被使用
 *  A类如果是顶级类，如果A类中有嵌套的断言语句
 */
public class StaticInnerClassSingleton {

    /**
     * 私有构造器
     */
    private StaticInnerClassSingleton(){
        // 防止反射破坏
        if (InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例模式不准许反射");
        }
    }

    /**
     * 延时初始化
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
