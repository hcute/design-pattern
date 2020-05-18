package hcute.hoo.design.pattern.structural.flyweight;

public class  Manager implements Employee {
    private String department; // 这个就是外部状态

    private String reportContent;

    private String title = "部门经理"; // 这个就是内部状态

    public Manager(String department) {
        this.department = department;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
