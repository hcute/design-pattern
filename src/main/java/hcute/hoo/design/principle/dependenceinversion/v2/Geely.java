package hcute.hoo.design.principle.dependenceinversion.v2;

public class Geely {
    private ICourse iCourse;

    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
