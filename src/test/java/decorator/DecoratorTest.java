package decorator;

import designpatterns.decorator.Decorator;
import designpatterns.decorator.Source;
import designpatterns.Sourceable;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 13:16
 * @Description:
 */
public class DecoratorTest {

    @Test
    public void test() {
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.menthod();
    }
}
