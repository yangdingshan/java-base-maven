package designpatterns.factory;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/12 15:45
 * @Description:
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
