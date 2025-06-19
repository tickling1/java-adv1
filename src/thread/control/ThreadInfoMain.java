package thread.control;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() = " + mainThread.getId()); // 절대 중복 X, 자바가 자동으로 내부적으로 만듬
        log("mainThread.threadName() = " + mainThread.getName()); // 이름은 중복될 수 있음 그래서 ID가 존재
        log("mainThread.priority() = " + mainThread.getPriority()); // 우선순위 (default = 5) 가 높을수록 더 많이 실행
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState()); // 실행될 수 있는 상태
        System.out.println("===========================================================================================");

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.getId()); // 절대 중복 X, 자바가 자동으로 내부적으로 만듬
        log("myThread.threadName() = " + myThread.getName()); // 이름은 중복될 수 있음 그래서 ID가 존재
        log("myThread.priority() = " + myThread.getPriority()); // 우선순위 (default = 5) 가 높을수록 더 많이 실행
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState()); // 실행될 수 있는 상태

    }
}
