package designpatterns.memento;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:35
 * @Description: 备忘录类
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
