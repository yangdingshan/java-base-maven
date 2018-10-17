package adapter.classs;

import designpatterns.adapter.classs.Adapter;
import designpatterns.adapter.classs.Source;
import designpatterns.adapter.classs.TargetTable;
import designpatterns.adapter.classs.Wrapper;
import org.junit.Test;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 10:27
 * @Description: 适配器模式测试
 */
public class AdapterTest {

    /**
     * 类的适配器模式测试
     */
    @Test
    public void test() {
        TargetTable targetTable = new Adapter();
        targetTable.method1();
        targetTable.method2();
    }

    /**
     * 对象的适配器模式，适配方式不同而已
     */
    @Test
    public void test1() {
        Source source = new Source();
        TargetTable targetTable = new Wrapper(source);
        targetTable.method1();
        targetTable.method2();
    }
}
