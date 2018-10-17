package adapter.interfaceadapter;

import designpatterns.adapter.interfaceadapter.SourceSub1;
import designpatterns.adapter.interfaceadapter.SourceSub2;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 10:58
 * @Description:
 */
public class WrapperTest {

    @Test
    public void test() {
        SourceSub1 sub1 = new SourceSub1();
        SourceSub2 sub2 = new SourceSub2();
        sub1.method1();
        sub1.method2();
        sub2.method2();
        sub2.method1();
    }
}
