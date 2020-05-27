package hcute.hoo.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void subscribe(String arg){
        System.out.println("执行GuavaEvent的subscribe方法，传入的参数：" + arg);
    }
}
