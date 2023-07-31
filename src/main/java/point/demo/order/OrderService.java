package point.demo.order;

// 인터페이스 역할 만들기.
public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
