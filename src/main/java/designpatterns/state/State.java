package designpatterns.state;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:49
 * @Description: 状态类
 */
public class State {

    /**
     * 状态
     */
    private String state;

    public State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void method1() {
        System.out.println("This is method1");
    }

    public void method2() {
        System.out.println("This is method2");
    }
}
