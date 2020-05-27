package hcute.hoo.design.pattern.behavioral.state;

public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    abstract void play();
    abstract void speed();
    abstract void pause();
    abstract void stop();
}
