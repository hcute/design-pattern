package hcute.hoo.design.pattern.creational.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BreakSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton hungrySingleton =HungrySingleton.getInstance();
        Method method = HungrySingleton.class.getDeclaredMethod("clone");
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);

    }
}
