package designpatterns.factory;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/11 13:28
 * @Description:
 */
public class SenderFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("错误类型");
            return null;
        }
    }

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
