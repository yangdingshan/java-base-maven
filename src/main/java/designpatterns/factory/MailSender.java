package designpatterns.factory;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/11 13:24
 * @Description:
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("This is mail sender");
    }
}
