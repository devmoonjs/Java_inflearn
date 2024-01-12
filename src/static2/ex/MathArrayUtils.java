package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){

    }

    public static int sum(int[] values){
        int result = 0;
        for(int value : values){
            result += value;
        }
        return result;
    }

    public static float average(int[] values){
        float sum = 0;
        float result = 0;
        for(int value : values){
            sum  += value;
        }
        return sum/ values.length;
    }

    public static int min(int[] values){
        int temp = values[0];
        for(int value : values){
            if (temp > value){
                temp = value;
            }
        }
        return temp;
    }

    public static int max(int[] values){
        int temp = values[0];
        for(int value : values){
            if(temp < value){
                temp = value;
            }
        }
        return temp;
    }
}
