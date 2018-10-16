package utils;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/9 17:35
 * @Description: 单例模式
 */
public class SingleDemo {
    // 饿汉式（线程安全，可用）
    private static SingleDemo singleDemo = new SingleDemo();

    private SingleDemo() {

    }

    public static SingleDemo getInstance() {
        return singleDemo;
    }
}

class SingleDemo2 {
    // 懒汉式（线程不安全）
    private static SingleDemo2 singleDemo2;

    private SingleDemo2() {

    }

    public static SingleDemo2 getInstance2() {
        if (singleDemo2 == null) {
            singleDemo2 = new SingleDemo2();
        }
        return singleDemo2;
    }
}

class SingleDemo3 {
    // 饿汉式线程安全，不建议使用
    private SingleDemo3() {}
    private static SingleDemo3 singleDemo3;

    public static synchronized SingleDemo3 getSingleDemo3() {
        if (singleDemo3 == null) {
            singleDemo3 = new SingleDemo3();
        }
        return singleDemo3;
    }
}

class SingleDemo4 {

    // 懒汉式（线程不安全，不可用）
    private static SingleDemo4 singleDemo4;

    private SingleDemo4() {}

    public static SingleDemo4 getSingleDemo4() {
        if (singleDemo4 == null) {
            synchronized (SingleDemo4.class) {
                singleDemo4 = new SingleDemo4();
            }
        }
        return singleDemo4;
    }
}

class SingleDemo5 {

    private static SingleDemo5 singleDemo5;

    private SingleDemo5() {}

    public static SingleDemo5 getSingleDemo5() {
        if (singleDemo5 == null) {
            synchronized (SingleDemo5.class) {
                if (singleDemo5 == null) {
                    singleDemo5 = new SingleDemo5();
                }
            }
        }
        return singleDemo5;
    }
}