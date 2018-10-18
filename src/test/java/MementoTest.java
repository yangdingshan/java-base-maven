import designpatterns.memento.Original;
import designpatterns.memento.Storage;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/18 10:39
 * @Description:
 */
public class MementoTest {

    @Test
    public void test() {
        Original original = new Original("first");
        Storage storage = new Storage(original.createMemento());
        System.out.println("原始值：" + original.getValue() + "\n备忘录值：" + storage.getMemento().getValue());
        original.setValue("secend");
        System.out.println("修改后的值：" + original.getValue());
        original.resetMemento(storage.getMemento());
        System.out.println("恢复后的值：" + original.getValue());
    }
}
