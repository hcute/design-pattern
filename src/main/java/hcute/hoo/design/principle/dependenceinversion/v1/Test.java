package hcute.hoo.design.principle.dependenceinversion.v1;

public class Test {

    // 面向接口的注入
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FECourse());
    }
}
