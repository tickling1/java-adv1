package thread.sync.test;

// 다음에서 value 필드(멤버 변수)는 공유되는 값이다. 멀티스레드 상황에서 문제가 될 수 있을까?
/**
 * 여러 스레드가 공유 자원에 접근하는 것 자체는 사실 문제가 되지 않는다.
 * 진짜 문제는 공유 자원을 사용하는 중간에 다른 스레드가 공유 자원의 값을 변경해버리기 때문에 발생한다. 결국 변경이 문제가 되는 것이다.
 * 여러 스레드가 접근 가능한 공유 자원이라도 그 값을 아무도 변경할 수 없다면 문제 되지 않는다. 이 경우 모든 스레드가 항상 같은 값을 읽기 때문이다.
 * 필드에 `final` 이 붙으면 어떤 스레드도 값을 변경할 수 없다. 따라서 멀티스레드 상황에 문제 없는 안전한 공유 자원이 된다.
 */
public class Immutable {
    private final int value;

    public Immutable(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
