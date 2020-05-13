package hcute.hoo.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT").buildCourseArticle("Java设计模式精讲手记").build();
        System.out.println(course);
    }
}
