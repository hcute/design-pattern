package hcute.hoo.design.principle.demeter.v0;

import java.util.ArrayList;

public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        ArrayList<Course> courses = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        teamLeader.checkCourseNumbers(courses);
    }
}
