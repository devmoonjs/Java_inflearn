package poly.ex.pay0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class PayMain2 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요 : ");
            String payOption = input.readLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요 : ");
            int amount = Integer.parseInt(input.readLine());

            payService.processPay(payOption, amount);
        }
    }
}
