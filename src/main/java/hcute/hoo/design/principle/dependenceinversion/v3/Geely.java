package hcute.hoo.design.principle.dependenceinversion.v3;

public class Geely {

    private ICourse iCourse;

    public ICourse getiCourse() {
        return iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
