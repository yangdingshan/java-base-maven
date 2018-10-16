package designpatterns;

import designpatterns.factory.MailSenderFactory;
import designpatterns.factory.Provider;
import designpatterns.factory.Sender;
import designpatterns.factory.SenderFactory;
import org.junit.Test;
/**
 * @Author: yangdingshan
 * @Date: 2018/10/11 13:25
 * @Description:
 */
public class TestDesign {

    @Test
    public void test1() {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("mail");
        sender.send();
    }

    @Test
    public void test2() {
        Sender sender = SenderFactory.produceMail();
        sender.send();
        Sender sender1 = SenderFactory.produceSms();
        sender1.send();
    }

    @Test
    public void test3() {
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}

