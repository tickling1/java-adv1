package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;

public class BoundedQueueV1 implements BoundedQueue {

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        if (queue.size() == max) {
            log("[put] 큐가 가득 참, 버림: " + data);
            return;
        }
        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    /**
     * 주의!
     * 원칙적으로 `toString()` 에도 `synchronized` 를 적용해야 한다.
     * 그래야 `toString()` 을 통한 조회 시점에 도 정확한 데이터를 조회할 수 있다.
     * 하지만 이 부분이 이번 설명의 핵심이 아니고, 또 예제 코드를 단순하게 유지하기 위해 여기서는 `toString()` 에 `synchronized` 를 사용하지 않겠다.
     */
    @Override
    public String toString() {
        return queue.toString();
    }
}
