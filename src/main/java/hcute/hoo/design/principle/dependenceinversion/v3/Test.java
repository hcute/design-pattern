package hcute.hoo.design.principle.dependenceinversion.v3;

public class Test {

    //  基于setter方式的注入
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new ScalaCourse());
        geely.studyImoocCourse();
        geely.setiCourse(new GoCourse());
        geely.studyImoocCourse();
    }
}
