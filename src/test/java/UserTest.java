import designpatterns.facade.Computer;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 14:28
 * @Description:
 */
public class UserTest {

    @Test
    public void test() {
        Computer computer = new Computer();
        computer.startup();
    }
}
