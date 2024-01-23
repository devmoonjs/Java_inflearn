package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10,10); // 부모의 생성자가 이미 정의되어 있기에 값을 넣어줘야 함.
        System.out.println("ClassC 생성자");
    }
}
