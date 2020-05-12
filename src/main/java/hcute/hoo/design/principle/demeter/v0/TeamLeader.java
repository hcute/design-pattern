package hcute.hoo.design.principle.demeter.v0;

import java.util.List;

public class TeamLeader {

    public void checkCourseNumbers(List<Course> courseList) {
        System.out.println("在线课程的数量为：" + courseList.size());
    }
}
