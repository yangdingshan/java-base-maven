package designpatterns.memento;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:36
 * @Description: 存储备忘录类
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
