import designpatterns.decorator.Sourceable;
import designpatterns.proxy.Proxy;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 14:00
 * @Description:
 */
public class ProxyTest {

    @Test
    public void test() {

        Sourceable proxy = new Proxy();
        proxy.menthod();
    }
}
