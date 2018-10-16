package designpatterns.factory;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/11 13:25
 * @Description:
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("This is sms Sender");
    }
}
