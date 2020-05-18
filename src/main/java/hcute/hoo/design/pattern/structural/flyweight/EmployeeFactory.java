package hcute.hoo.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static  final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();


    public static Employee getManager(String departmentName){
        Manager manager =  (Manager) EMPLOYEE_MAP.get(departmentName);

        if (manager == null) {
            System.out.print ("创建部门经理：" + departmentName);
            String reportContent = departmentName + "部门汇报：汇报内容是......";
            manager = new Manager(departmentName);
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告：" + reportContent);
            EMPLOYEE_MAP.put(departmentName,manager);
        }

        return manager;
    }
}
