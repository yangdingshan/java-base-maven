package observer;

import designpatterns.observer.Observer;
import designpatterns.observer.Observerable;
import designpatterns.observer.User;
import designpatterns.observer.WechatServer;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 16:33
 * @Description:
 */
public class ObserverTest {

    @Test
    public void test() {
        WechatServer wechatServer = new WechatServer();

        Observer observer = new User("zhangsan");
        Observer observer1 = new User("lisi");
        Observer observer2 = new User("wangwu");

        wechatServer.registerObserver(observer);
        wechatServer.registerObserver(observer1);
        wechatServer.registerObserver(observer2);
        wechatServer.setInfomation("Java是最好的编程语言");
    }
}
