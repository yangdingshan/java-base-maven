package iterator;

import designpatterns.iterator.Iterator;
import designpatterns.iterator.MyCollection;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 17:01
 * @Description:
 */
public class IteratorTest {

    @Test
    public void test() {
        MyCollection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
