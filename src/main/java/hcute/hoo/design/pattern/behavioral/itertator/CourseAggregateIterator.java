package hcute.hoo.design.pattern.behavioral.itertator;

import java.util.List;

public class CourseAggregateIterator implements CourseIterator {

    private int position = 0;

    private Course course;

    private List<Course>  courses;

    public CourseAggregateIterator(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean hasNext() {
        return position != courses.size();
    }

    @Override
    public Course next() {
        System.out.println("当前位置：" + position);
        course = courses.get(position);
        System.out.println("当前课程是：" + course.getName());
        position++;
        return course;
    }
}
