package hcute.hoo.design.principle.compsitionaggregation;

public class MysqlConnection extends DBConnection {
    public void getConnection() {
        System.out.println("MysqlConnection连接数据库");
    }
}
