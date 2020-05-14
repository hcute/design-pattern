package hcute.hoo.design.pattern.creational.singleton;

/**
 * volatile  + double check
 */
public class LazyDoubleCheckSingleton {

    // 添加volatile 防止重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    // 类的创建有多步，可能会重排序
                    // 1，分配内存给这个对象
                    // 2，初始化对象
                    // 3，设置lazyDoubleCheckSingleton 指向对象的内存地址
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
