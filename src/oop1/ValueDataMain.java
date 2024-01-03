package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valuedata = new ValueData();
        add(valuedata);
        add(valuedata);
        add(valuedata);
    }

    static void add(ValueData valuedata){
        valuedata.value++;
        System.out.println("숫자 증가 value = " + valuedata.value);
    }
}
