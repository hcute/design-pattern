package hcute.hoo.design.pattern.creational.simplefactory;

public class Test {

    public static void main(String[] args) {
//        Video video = new PythonVideo();
//        video.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();
    }
}
