package designpatterns.adapter.classs;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 10:25
 * @Description:
 */
public class Adapter extends Source implements TargetTable {

    @Override
    public void method2() {
        System.out.println("This is target method");
    }
}
