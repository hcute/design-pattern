package hcute.hoo.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<Course>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC的数据绑定");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("java设计模式精讲");
        codingCourse.setPrice("366");
        courses.add(freeCourse);
        courses.add(codingCourse);
        for (Course cours : courses) {
            cours.accept(new Visitor());
        }
    }
}
