package hcute.hoo.design.pattern.creational.singleton;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println("program end");
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");
        // 使用序列化和反序列化来破坏单例
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
//        HungrySingleton instance = HungrySingleton.getInstance();
//        oos.writeObject(HungrySingleton.getInstance());
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton"));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        /*// 演示反射破坏单例
        Class objectClass = HungrySingleton.class;
        // 构造器私有如何让反射可以构造对象
        Constructor declaredConstructor = objectClass.getDeclaredConstructor();
        // 改变构造器被私有化，是的可以创建对象
        declaredConstructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/


    }
}
