import designpatterns.command.Command;
import designpatterns.command.Invoker;
import designpatterns.command.MyCommand;
import designpatterns.command.Receiver;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:15
 * @Description:
 */
public class CommandTests {

    @Test
    public void test() {
        Receiver receiver = new Receiver();
        Command myCommand = new MyCommand(receiver);
        Invoker invoker = new Invoker(myCommand);
        invoker.action();
    }
}
