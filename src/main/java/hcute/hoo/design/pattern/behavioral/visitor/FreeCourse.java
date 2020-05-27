package hcute.hoo.design.pattern.behavioral.visitor;

public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
