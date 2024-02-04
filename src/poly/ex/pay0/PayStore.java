package poly.ex.pay0;

public abstract class PayStore {

    public static Pay findPay(String option) {
        Pay pay;
        //결제 옵션 선택 / 결제
        switch (option) {
            case "kakao":
                return new KaKaoPay();

            case "naver":
                return new NaverPay();

            case "cashPay":
                return new CashPay();

            default:
                return new DefalutPay();
        }
    }
}
