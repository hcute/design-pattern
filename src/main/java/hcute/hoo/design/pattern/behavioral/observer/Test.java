package hcute.hoo.design.pattern.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("java设计模式精讲");
        Teacher alpha = new Teacher("Alpha");
        Teacher beta = new Teacher("Beta");
        course.addObserver(alpha);
        course.addObserver(beta);
        Question question = new Question();
        question.setUsername("hooray");
        question.setContent("java的主函数如何编写？");
        course.produceQuestion(course,question);
    }
}
