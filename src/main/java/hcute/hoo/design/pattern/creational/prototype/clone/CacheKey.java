package hcute.hoo.design.pattern.creational.prototype.clone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CacheKey implements Serializable,Cloneable {

    private List<String> stringCache;

    private List<Object> objectCache;

    public List<String> getStringCache() {
        return stringCache;
    }

    public void setStringCache(List<String> stringCache) {
        this.stringCache = stringCache;
    }

    public List<Object> getObjectCache() {
        return objectCache;
    }

    public void setObjectCache(List<Object> objectCache) {
        this.objectCache = objectCache;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CacheKey cacheKey = (CacheKey) super.clone();
        cacheKey.stringCache = new ArrayList<String>(this.stringCache);
        cacheKey.objectCache = new ArrayList<Object>(this.objectCache);
        return cacheKey;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CacheKey cacheKey = new CacheKey();
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("123");
        strings.add("456");
        cacheKey.setStringCache(strings);
        List<Object> objects = new ArrayList<Object>();
        Object o = new Object();
        objects.add(o);
        cacheKey.setObjectCache(objects);

        CacheKey cacheKey1 = (CacheKey) cacheKey.clone();
        cacheKey.getStringCache().add("789");
        cacheKey.getObjectCache().add(new Object());

        System.out.println(cacheKey.getStringCache());
        System.out.println(cacheKey.getObjectCache());
        System.out.println("===============");
        System.out.println(cacheKey1.getStringCache());
        System.out.println(cacheKey1.getObjectCache());
    }
}
