package thread.executor.test;

import java.util.concurrent.ExecutionException;

import static util.ThreadUtils.sleep;

public class NewOrderServiceTestMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String orderNo = "Order#1234"; // 예시 주문 번호
        NewOrderService orderService = new NewOrderService();
        orderService.order(orderNo);
        sleep(1500);
    }
}
