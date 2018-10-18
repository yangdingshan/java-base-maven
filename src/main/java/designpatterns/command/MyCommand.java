package designpatterns.command;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:11
 * @Description:
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
