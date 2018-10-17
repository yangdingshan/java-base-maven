package designpatterns.adapter.classs;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 10:30
 * @Description: 对象的适配器模式
 */
public class Wrapper implements TargetTable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is target method");
    }
}
