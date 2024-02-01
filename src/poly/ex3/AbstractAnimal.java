package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound(); // 추상 메서드 -> 자식 클래스에서 반드시 오버라이딩하여 정의해야 됨.

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
