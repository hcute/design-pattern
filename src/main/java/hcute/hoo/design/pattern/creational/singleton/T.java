package hcute.hoo.design.pattern.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " +  staticInnerClassSingleton);

        // 测试容器单例
        /*ContainerSingleton.putInstance("object",new Object());
        Object object = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + " " +  object);*/

        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " +  instance);
    }
}
