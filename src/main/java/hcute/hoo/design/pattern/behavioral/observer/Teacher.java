package hcute.hoo.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question) arg;
        System.out.println(name + "老师的" + course.getName() + "课程收到了" + question.getUsername() +"提交的问题：" + question.getContent());
    }
}
