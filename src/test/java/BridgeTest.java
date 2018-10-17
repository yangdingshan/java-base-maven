import designpatterns.bridge.Bridge;
import designpatterns.bridge.MyBridge;
import designpatterns.bridge.SourceSub1;
import designpatterns.bridge.SourceSub2;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 14:57
 * @Description:
 */
public class BridgeTest {

    @Test
    public void test() {
        Bridge bridge = new MyBridge();
        bridge.setSource(new SourceSub1());
        bridge.method();
        bridge.setSource(new SourceSub2());
        bridge.method();
    }
}
