package designpatterns.factory;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/12 15:43
 * @Description:
 */
public class MailSenderFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
