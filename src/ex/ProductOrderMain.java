package ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dubu = new ProductOrder();
        ProductOrder kimchi = new ProductOrder();
        ProductOrder coke = new ProductOrder();

        ProductOrder[] orders = new ProductOrder[3];

        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;
        orders[0] = dubu;

        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        orders[1] = kimchi;

        coke.productName = "콜라 ";
        coke.price = 1500;
        coke.quantity = 2;
        orders[2] = coke;

        int count = 0;

        for(ProductOrder order : orders){
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            count += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + count);
    }
}
