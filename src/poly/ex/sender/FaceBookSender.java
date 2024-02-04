package poly.ex.sender;

public class FaceBookSender implements Sender {

    public String message;

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("페이스북에 발송합니다 : " + message);
    }
}
