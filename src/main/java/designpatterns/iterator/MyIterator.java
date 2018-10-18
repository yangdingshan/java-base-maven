package designpatterns.iterator;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 16:56
 * @Description:
 */
public class MyIterator implements Iterator {

    private Collection collection;

    private int pos = -1;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (pos < collection.size() - 1) {
            pos ++;
        }
        return collection.get(pos);
    }

    @Override
    public Object previous() {
        if (pos > 0) {
            pos --;
        }
        return collection.get(pos);
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
