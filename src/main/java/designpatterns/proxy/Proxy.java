package designpatterns.proxy;

import designpatterns.decorator.Source;
import designpatterns.Sourceable;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 13:58
 * @Description: 代理类
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void menthod() {
        before();
        source.menthod();
        after();
    }

    private void before() {
        System.out.println("proxy before");
    }

    private void after() {
        System.out.println("proxy after");
    }
}
