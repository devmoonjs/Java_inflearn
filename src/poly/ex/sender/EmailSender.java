package poly.ex.sender;

public class EmailSender implements Sender {

    public String message;

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("메일을 발송합니다 : " + message);
    }
}
