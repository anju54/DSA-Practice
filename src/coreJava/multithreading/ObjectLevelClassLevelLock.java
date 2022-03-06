package coreJava.multithreading;

// reference - https://www.youtube.com/watch?v=UmUbv3Nxz7g
public class ObjectLevelClassLevelLock {

    public static void main(String[] args) {
        ThreadClass obj = new ThreadClass();
        ThreadClass obj1 = new ThreadClass();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }

}
