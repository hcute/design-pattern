package hcute.hoo.design.pattern.behavioral.state;

public class SpeedState extends CourseVideoState {
    @Override
    void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    void speed() {
        System.out.println("快进播放视频");
    }

    @Override
    void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);

    }

    @Override
    void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);

    }
}
