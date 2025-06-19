package thread.control;

/**
 * 자바에서 메서드를 재정의 할 때, 재정의 메서드가 지켜야할 예외와 관련된 규칙이 있다.
 * **체크 예외**
 * 부모 메서드가 체크 예외를 던지지 않는 경우, 재정의된 자식 메서드도 체크 예외를 던질 수 없다.
 * 자식 메서드는 부모 메서드가 던질 수 있는 체크 예외의 하위 타입만 던질 수 있다.
 * 결론적으로, 체크예외도 상속이 된다!!
 *
 * **언체크(런타임) 예외**
 * 예외 처리를 강제하지 않으므로 상관없이 던질 수 있다.
 * `Runnable` 인터페이스의 `run()` 메서드는 아무런 체크 예외를 던지지 않는다.
 * 따라서 `Runnable` 인터페이스의 `run()` 메서드를 재정의 하는 곳에서는 체크 예외를 밖으로 던질 수 없다.
 *
 * **체크 예외 재정의 규칙**
 * 자식 클래스에 재정의된 메서드는 부모 메서드가 던질 수 있는 체크 예외의 하위 타입만을 던질 수 있다.
 * 원래 메서드가 체크 예외를 던지지 않는 경우, 재정의된 메서드도 체크 예외를 던질 수 없다.
 */
public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception{
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable{
        @Override
        public void run() /*throws Exception*/{
            // throw new Exception();
            throw new RuntimeException();
        }
    }
}
