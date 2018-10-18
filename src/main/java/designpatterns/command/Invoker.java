package designpatterns.command;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:13
 * @Description:
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
