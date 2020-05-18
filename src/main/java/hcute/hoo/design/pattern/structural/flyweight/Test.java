package hcute.hoo.design.pattern.structural.flyweight;


public class Test {
    private static final String[] departments = {"RD","QA","PM","BD"};
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            String departmentName = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(departmentName);
            manager.report();
        }
    }
}
