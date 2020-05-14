package hcute.hoo.design.pattern.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " +  staticInnerClassSingleton);
    }
}
