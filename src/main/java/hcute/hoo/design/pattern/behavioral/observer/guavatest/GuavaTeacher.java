package hcute.hoo.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;
import hcute.hoo.design.pattern.behavioral.observer.Question;

public class GuavaTeacher {
    private String name;

    public GuavaTeacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question){
        System.out.println(this.name + "收到"+question.getUsername()+"提出的一个问题：" + question.getContent());
    }
}
