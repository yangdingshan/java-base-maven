package designpatterns.state;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:51
 * @Description: 切换类
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if ("state1".equals(state.getState())) {
            state.method1();
        } else if ("state2".equals(state.getState())) {
            state.method2();
        }
    }
}
