package hcute.hoo.design.pattern.creational.singleton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用枚举创建单例 effect Java 强烈推荐的实现单例的方式
 */
public enum  EnumInstance {
    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("hooray print test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 测试枚举类的序列化和反序列化的破坏
        EnumInstance enumInstance = EnumInstance.getInstance();
        enumInstance.setData(new Object());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(enumInstance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton"));
        EnumInstance instance = (EnumInstance) ois.readObject();
        System.out.println(enumInstance.getData());
        System.out.println(instance.getData());
        System.out.println(instance.getData() == enumInstance.getData());

        System.out.println("========================================");

        // 演示Enum无法进行反射攻击
        /*Class<EnumInstance> enumInstanceClass = EnumInstance.class;
        Constructor<EnumInstance> declaredConstructor = enumInstanceClass.getDeclaredConstructor(String.class, int.class);

        declaredConstructor.setAccessible(true);
        EnumInstance enumInstance1 = declaredConstructor.newInstance("hooray", 666);*/

        EnumInstance instance1 = EnumInstance.getInstance();
        instance1.printTest();
    }
}
