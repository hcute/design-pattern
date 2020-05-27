package hcute.hoo.design.pattern.behavioral.command;

public class Test {
    public static void main(String[] args) {
        Staff staff = new Staff();
        CourseVideo courseVideo = new CourseVideo("Java设计模式- By Geely");
        Command openCommand = new OpenCourseVideoCommand(courseVideo);
        Command closeCommand = new CloseCourseVideoCommand(courseVideo);

        staff.addCommand(openCommand);
        staff.addCommand(closeCommand);

        staff.executeCommand();
    }
}
