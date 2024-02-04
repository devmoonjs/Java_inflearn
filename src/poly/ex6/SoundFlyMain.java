package poly.ex6;

import poly.diamond.Child;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        fly(bird);
        fly(chicken);

    }

    private static void soundAnimal(abAbstractAnimal animal) { // abAbstractAnimal을 상속 받은 animal 객체들
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void fly(Fly fly) { // Fly 인터페이스를 구현한 fly 객체들
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
