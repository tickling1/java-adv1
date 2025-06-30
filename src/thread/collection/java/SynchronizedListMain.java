package thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SynchronizedListMain {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                log("동기화 컬렉션에 데이터 추가 중");
                list.add("A");
                log("동기화 컬렉션에 데이터 추가 완료");
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                log("동기화 컬렉션에 데이터 추가 중");
                list.add("B");
                log("동기화 컬렉션에 데이터 추가 완료");
            }
        };

        Thread threadA = new Thread(task1, "ThreadA");
        Thread threadB = new Thread(task2, "ThreadB");
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
        System.out.println(list.getClass());
        log(list);
    }
}
