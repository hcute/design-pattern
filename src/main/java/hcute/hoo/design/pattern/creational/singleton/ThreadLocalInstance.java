package hcute.hoo.design.pattern.creational.singleton;

/**
 * 基于ThreadLocal 实现的线程中的单例模式
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance
            = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }
}
