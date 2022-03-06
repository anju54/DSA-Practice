package coreJava.multithreading;

public class ThreadClass implements Runnable{

//    public synchronized void display(){
//        try {
//            System.out.println("Getting lock"+Thread.currentThread().getName());
//            Thread.sleep(2000);
//            System.out.println("Leaving lock"+Thread.currentThread().getName());
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }

    public static synchronized void display(){
        try {
            System.out.println("Getting lock"+Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("Leaving lock"+Thread.currentThread().getName());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void run() {
        display();
    }
}
