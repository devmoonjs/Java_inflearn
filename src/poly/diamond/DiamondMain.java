package poly.diamond;

import com.sun.security.jgss.GSSUtil;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon(); // 어차피 오버라이딩 됐기 때문에 자식 메서드가 생성

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
