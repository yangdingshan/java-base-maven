package designpatterns.decorator;

import designpatterns.Sourceable;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 13:09
 * @Description: 被装饰类
 */
public class Source implements Sourceable {


    @Override
    public void menthod() {
        System.out.println("This is source method");
    }
}
