package designpatterns.bridge;

import designpatterns.Sourceable;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 14:55
 * @Description:
 */
public abstract class Bridge {

    private Sourceable source;

    public void method() {
        source.menthod();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
