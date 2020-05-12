package hcute.hoo.design.principle.compsitionaggregation;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        product.setDbConnection(new MysqlConnection());
        product.addProduct();
    }
}
