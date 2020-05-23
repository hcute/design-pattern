package hcute.hoo.design.pattern.structural.proxy.db;

public class DataSourceContextHodler {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return CONTEXT_HOLDER.get();
    }

    public static void remvoeDBType(){
        CONTEXT_HOLDER.remove();
    }
}
