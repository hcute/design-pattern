package hcute.hoo.design.pattern.behavioral.state;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StopState extends CourseVideoState {
    @Override
    void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    void speed() {
        System.out.println("停止状态下不能快进");
    }

    @Override
    void pause() {
        System.out.println("停止状态下不能暂停");
    }

    @Override
    void stop() {
        System.out.println("停止播放视频");
    }
}
