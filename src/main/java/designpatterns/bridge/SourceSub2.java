package designpatterns.bridge;

import designpatterns.Sourceable;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 14:54
 * @Description:
 */
public class SourceSub2 implements Sourceable {
    @Override
    public void menthod() {
        System.out.println("this is secend sub!");
    }
}
