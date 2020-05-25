package hcute.hoo.design.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供后端的Java源代码");
    }

    @Override
    protected boolean needWriteArtilce() {
        return true;
    }
}

