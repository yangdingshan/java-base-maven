package designpatterns.iterator;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 16:54
 * @Description:
 */
public class MyCollection implements Collection {

    private String[] sts = new String[]{"A","B","C","D","E"};


    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return sts[i];
    }

    @Override
    public int size() {
        return sts.length;
    }
}
