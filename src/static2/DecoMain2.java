package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String Deco = DecoUtil2.deco(s);

        System.out.println("Before : " + s);
        System.out.println("After : " + Deco);
    }
}
