package designpatterns.observer;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 16:20
 * @Description: 抽象被观察者
 */
public interface Observerable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
