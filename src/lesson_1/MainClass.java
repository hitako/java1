package lesson_1;

public class MainClass {
    public static void main(String[] args) {

        int i = 5;
        char c = 'c';
        byte b = 25;
        double d = 2.5254;
        float f = 1.5235f;
        long l = 55124L;
        boolean bool = true;

        System.out.println(calc(1, 2, 3, 4));
        System.out.println(checkInterval(6, 4));
    }

    private static int calc(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean checkInterval(int a, int b) {
        return ( (a + b) <= 20 && (a + b) >= 10 );
    }
}