package hcute.hoo.design.pattern.behavioral.itertator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> courses = new ArrayList<Course>();

    @Override
    public void add(Course course) {
        courses.add(course);
    }

    @Override
    public void remove(Course course) {
        courses.remove(course);
    }

    @Override
    public void printCourse() {
        CourseIterator courseIterator = new CourseAggregateIterator(courses);
        while (courseIterator.hasNext()) {
            courseIterator.next();
        }
    }
}
