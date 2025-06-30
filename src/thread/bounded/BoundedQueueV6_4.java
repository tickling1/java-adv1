package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static util.MyLogger.log;

public class BoundedQueueV6_4 implements BoundedQueue {

    private BlockingQueue<String> queue;

    public BoundedQueueV6_4(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
        boolean result = queue.add(data); // java.lang.IllegalStateException: Queue full
        log("저장 시도 결과 = " + result);
    }

    @Override
    public String take() {
        return queue.remove(); // java.util.NoSuchElementException
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
