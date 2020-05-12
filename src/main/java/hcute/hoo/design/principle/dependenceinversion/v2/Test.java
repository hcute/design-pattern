package hcute.hoo.design.principle.dependenceinversion.v2;

public class Test {

    public static void main(String[] args) {
        Geely geely = new Geely(new HtmlCourse());
        geely.studyImoocCourse();
        Geely geely1 = new Geely(new PythonCourse());
        geely1.studyImoocCourse();
    }

}
