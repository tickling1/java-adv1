package thread.executor.test;

import java.util.concurrent.ExecutionException;

import static util.ThreadUtils.sleep;

public class OldOrderServiceTestMain {

    public static void main(String[] args) {
        String orderNo = "Order#1234"; // 예시 주문 번호
        OldOrderService orderService = new OldOrderService();
        orderService.order(orderNo);
        sleep(1500);
    }
}
