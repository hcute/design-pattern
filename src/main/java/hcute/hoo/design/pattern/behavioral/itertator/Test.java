package hcute.hoo.design.pattern.behavioral.itertator;

public class Test {

    public static void main(String[] args) {
        Course java = new Course("java");
        Course python = new Course("python");
        Course goinfo = new Course("go");
        Course linux = new Course("linux");
        Course windows = new Course("windows");
        Course c = new Course("c++");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.add(java);
        courseAggregate.add(python);
        courseAggregate.add(goinfo);
        courseAggregate.add(linux);
        courseAggregate.add(windows);
        courseAggregate.add(c);

        courseAggregate.printCourse();

        System.out.println("=======================");
        courseAggregate.remove(linux);
        courseAggregate.remove(windows);
        courseAggregate.printCourse();
    }
}
