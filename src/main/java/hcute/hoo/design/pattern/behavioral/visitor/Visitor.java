package hcute.hoo.design.pattern.behavioral.visitor;

/**
 * 同一个数据进行不同的处理
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + ",价格：" + codingCourse.getPrice() + "元");
    }
}
