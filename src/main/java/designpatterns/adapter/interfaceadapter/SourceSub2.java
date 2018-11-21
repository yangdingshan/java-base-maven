package designpatterns.adapter.interfaceadapter;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 10:57
 * @Description:
 */
public class SourceSub2 extends Wrapper2 {

    @Override
    public void method2() {
        System.out.println("This is sub2 method");
    }
}
