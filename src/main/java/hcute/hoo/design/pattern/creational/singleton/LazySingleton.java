package hcute.hoo.design.pattern.creational.singleton;

import org.omg.SendingContext.RunTime;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 无法防止反射的破坏 即使加flag标志也不能阻止
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private boolean flag = true;
    private LazySingleton() {
//        if (flag) {
//            flag = false;
//        }else {
//            throw new RuntimeException("单例构造方法禁止反射");
//        }
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
//
//        Constructor<LazySingleton> declaredConstructor = lazySingletonClass.getDeclaredConstructor();
//        LazySingleton instance = LazySingleton.getInstance();
//        Field flag = instance.getClass().getDeclaredField("flag");
//        flag.set(instance,true);
//        declaredConstructor.setAccessible(true);
//        LazySingleton lazySingleton = declaredConstructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(lazySingleton);
//        System.out.println(instance == lazySingleton);
//
//    }
}
