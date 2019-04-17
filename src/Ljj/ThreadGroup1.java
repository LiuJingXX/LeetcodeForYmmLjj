package Ljj;

/**
 * @ClassName ThreadGroup1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/2/26 20:11
 * @Version 1.0
 **/
public class ThreadGroup1 implements Runnable{
    static ThreadGroup1 instance = new ThreadGroup1();
    static Integer i = 200;
    public void increase(){
        i++;
    }
    public static void main(String[] args) throws InterruptedException{
        /*ThreadGroup threadGroup = new ThreadGroup("PGroup");
        Thread t1 = new Thread(threadGroup,new ThreadGroup1(),"T1");
        Thread t2 = new Thread(threadGroup,new ThreadGroup1(),"T2");
        t1.start();
        t2.start();
        System.out.println(threadGroup.activeCount());
        threadGroup.list();
        */
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }

    @Override
    public void run() {
        /*String name = Thread.currentThread().getThreadGroup().getName() + "--" + Thread.currentThread().getName();

        while (true){
            System.out.println("I  am  " + name);
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        */
        for(int j = 0;j < 10000000;j++){
            synchronized (instance){
                i++;
            }
        }
    }
}
