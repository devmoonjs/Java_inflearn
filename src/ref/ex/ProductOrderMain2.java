package ref.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOrderMain2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = Integer.parseInt(bf.readLine());

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i<n; i++){
            System.out.println((i+1) + " 번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = bf.readLine();

            System.out.print("가 격 : ");
            int price = Integer.parseInt(bf.readLine());

            System.out.print("수 량 : ");
            int quantity = Integer.parseInt(bf.readLine());

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.print("총 금액 : " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders){
        System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders){
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
