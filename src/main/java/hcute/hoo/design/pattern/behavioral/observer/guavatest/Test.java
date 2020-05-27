package hcute.hoo.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;
import hcute.hoo.design.pattern.behavioral.observer.Question;

public class Test {

//    public static void main(String[] args) {
//        EventBus eventBus = new EventBus();
//        GuavaEvent guavaEvent = new GuavaEvent();
//        eventBus.register(guavaEvent);
//        eventBus.post("post的参数");
//    }

    public static void main(String[] args) {
        GuavaCourse guavaCourse = new GuavaCourse("java设计模式精讲");

        Question question = new Question();
        question.setUsername("hooray");
        question.setContent("python容易学吗？");

        GuavaTeacher alpha = new GuavaTeacher("Alpha");
        EventBus eventBus = new EventBus();
        eventBus.register(alpha);
        guavaCourse.produceQuestion(eventBus,guavaCourse,question);
    }
}
