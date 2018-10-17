package designpatterns.bridge;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 14:58
 * @Description:
 */
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSource().menthod();
    }
}
