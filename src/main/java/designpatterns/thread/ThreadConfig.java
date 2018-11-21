package designpatterns.thread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Author: yangdingshan
 * @Date: 2018/11/21 14:23
 * @Description:
 */
public class ThreadConfig {

    // 线程池维护线程的最少数量
    private final static int CORE_POOL_SIZE = 10;

    // 线程池维护线程的最大数量
    private final static int MAX_POOL_SIZE = 20;

    // 线程池维护线程所允许的空闲时间
    private final static int KEEP_ALIVE_TIME = 30;

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE,
                KEEP_ALIVE_TIME, TimeUnit.SECONDS,
                new LinkedBlockingQueue(128));
        /*Future<Integer> future = executorService.submit(() -> {
            int a = 1 + 2;
            return a;
        });
        Integer a = future.get(60L, TimeUnit.SECONDS);
        System.out.println(a);*/

        for (int i = 0; i < 10; i++) {
            // executorService.execute(new tack(i));
            executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "---i=" );
            });
        }



    }


}

class tack implements Runnable {

    private int i;

    private final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss.SSS");

    public tack(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("thread:" + Thread.currentThread().getName() + ",time:" + format.format(new Date()) + ",num:" + i);
        try {
            //使线程睡眠，模拟线程阻塞情况
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
