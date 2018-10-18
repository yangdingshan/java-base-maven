package designpatterns.iterator;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 16:51
 * @Description: 集合接口
 */
public interface Collection {

    public Iterator iterator();

    public Object get(int i);

    public int size();

}
