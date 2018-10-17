package designpatterns.adapter.interfaceadapter;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 10:56
 * @Description:
 */
public class SourceSub1 extends Wrapper2 {

    @Override
    public void method1() {
        System.out.println("This is sub1 method");
    }
}
