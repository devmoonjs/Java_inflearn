package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10; // final 변수이기에 최초 한 번만 할당 가능

        final int data2 = 10;
    }

    static void method(final int parameter){
        // 매개변수로 받았기에 더 이상 할당 불가
    }
}
