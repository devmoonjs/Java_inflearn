package poly.ex2;

public class AnimalPolyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animalArr = {dog, cat, caw};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound(); // 각 자식 클래스에서 부모 클래스의 메서드를 오버라이딩 했기 때문에, 오버라이딩 메서드 우선으로 인해 자식 메서드가 실행됨.
            System.out.println("동물 소리 테스트 종료");
        }

    }

    private static void soundAnimal(Animal animal) { // 부모는 자식을 담을 수 있다.
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("종료");
    }
}
