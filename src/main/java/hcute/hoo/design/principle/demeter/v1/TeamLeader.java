package hcute.hoo.design.principle.demeter.v1;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkCourseNumbers(){
        List<Course> courses = new ArrayList<Course>();

        for (int i = 0; i < 20 ; i++) {
            courses.add(new Course());
        }

        System.out.println("课程的数量为：" + courses.size());
    }
}
