package poly.ex.sender;

public class SmsSender implements Sender {

    public String message;

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("SMS를 발송합니다 : " + message);
    }
}
