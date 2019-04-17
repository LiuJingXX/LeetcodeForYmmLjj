package Ljj.test;

/**
 * @ClassName ThreadOddEven
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/30 21:46
 * @Version 1.0
 **/
public class ThreadOddEven {
    private static int count = 0;
    private static final Object lock = new Object();
    static class Thread1 implements Runnable{
        @Override
        public void run() {
            while(count <= 100){
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName() + ":" + count++);
                    lock.notifyAll();
                    try{
                        if(count <= 100){
                            lock.wait();
                        }
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        new Thread(new Thread1(),"Even").start();
        Thread.sleep(1);
        new Thread(new Thread1(),"Odd").start();
    }
}
