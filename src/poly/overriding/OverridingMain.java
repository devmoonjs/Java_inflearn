package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("Value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드는 오버라딩 된 것이 우선권을 가진다. 그래서 child에서 오버라이딩한 메서드가 출력됨.
    }
}
