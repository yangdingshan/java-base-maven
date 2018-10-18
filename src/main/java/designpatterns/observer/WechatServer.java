package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 16:22
 * @Description:
 */
public class WechatServer implements Observerable {

    private List<Observer> list = new ArrayList<Observer>();

    private String message;

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信更新消息：" + s);
        notifyObserver();
    }
}
