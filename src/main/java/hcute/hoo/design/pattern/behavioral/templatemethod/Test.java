package hcute.hoo.design.pattern.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("后端课程开始------------");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端课程结束------------");

        System.out.println("前课程开始------------");
        ACourse feCouse = new FECourse(true);
        feCouse.makeCourse();
        System.out.println("前课程结束------------");

    }
}
