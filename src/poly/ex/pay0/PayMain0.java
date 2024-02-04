package poly.ex.pay0;

public class PayMain0 {

    public static void main(String[] args) {

        PayService payService = new PayService();

        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        String payOption2 = "naver";
        int amount2 = 15000;
        payService.processPay(payOption2, amount2);

        String payOption3 = "bad";
        int amount3 = 1000;
        payService.processPay(payOption3, amount3);

        String payOption4 = "cashPay";
        int amount4 = 41000;
        payService.processPay(payOption4 , amount4);
    }
}
