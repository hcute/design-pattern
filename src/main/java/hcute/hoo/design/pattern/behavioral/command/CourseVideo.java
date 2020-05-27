package hcute.hoo.design.pattern.behavioral.command;

public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name + "的视频被打开了");
    }

    public void close(){
        System.out.println(this.name + "的视频被关闭了");
    }
}
