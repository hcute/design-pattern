package hcute.hoo.design.pattern.behavioral.observer;


import java.util.Observable;

public class Course extends Observable {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUsername() + "在" + course.name + "提交了一个问题: " + question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
