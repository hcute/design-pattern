package hcute.hoo.design.pattern.behavioral.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("java设计模式精讲 -- By Geely");
        course.setArticle("java设计模式精讲手记");
        course.setVideo("java设计模式精讲视频");

        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
