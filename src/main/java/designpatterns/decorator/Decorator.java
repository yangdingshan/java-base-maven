package designpatterns.decorator;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 13:10
 * @Description: 装饰类
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void menthod() {
        System.out.println("before");
        source.menthod();
        System.out.println("after");
    }
}
