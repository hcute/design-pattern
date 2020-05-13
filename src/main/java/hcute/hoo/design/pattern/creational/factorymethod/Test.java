package hcute.hoo.design.pattern.creational.factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        PythonVideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video video = javaVideoFactory.getVideo();
        video.produce();
    }
}
