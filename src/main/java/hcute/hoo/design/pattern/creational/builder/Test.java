package hcute.hoo.design.pattern.creational.builder;

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course =
                coach.makeCourse("Java设计模式课程", "Java设计课程PPT",
                        "Java设计模式课程视频", "Java设计模式课程手记", "Java设计模式课程问答");
        System.out.println(course);
    }
}
