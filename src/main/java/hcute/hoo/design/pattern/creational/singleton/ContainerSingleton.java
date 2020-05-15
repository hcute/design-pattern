package hcute.hoo.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式：HashMap是线程不安全的，但是一般不使用HashTable，如果使用ConcurrentHashMap也在一定程度上不是线程安全的
 */
public class ContainerSingleton {
    private static Map<String,Object> singletonMap = new HashMap<String,Object>();


    private ContainerSingleton(){

    }

    public static void putInstance(String key,Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
