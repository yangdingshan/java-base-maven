import designpatterns.state.Context;
import designpatterns.state.State;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:53
 * @Description:
 */
public class StateTest {

    @Test
    public void test() {
        State state = new State("state1");
        Context context = new Context(state);
        context.method();
        State state2 = new State("state2");
        context.setState(state2);
        context.method();
    }
}
