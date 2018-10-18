package designpatterns.iterator;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 16:52
 * @Description:
 */
public interface Iterator {

    public boolean hasNext();

    public Object next();

    public Object previous();

    public Object first();
}
