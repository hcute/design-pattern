package hcute.hoo.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;
import hcute.hoo.design.pattern.behavioral.observer.Question;

public class GuavaCourse {
    private String name;

    public GuavaCourse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void produceQuestion(EventBus eventBus, GuavaCourse course, Question question) {
        System.out.println(question.getUsername()+"在" + course.name + "提出了一个问题："+ question.getContent());
        eventBus.post(question);
    }
}
