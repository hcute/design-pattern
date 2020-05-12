package hcute.hoo.design.principle.compsitionaggregation;

public class Product {

    private DBConnection dbConnection;

    public DBConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        dbConnection.getConnection();
    }
}
