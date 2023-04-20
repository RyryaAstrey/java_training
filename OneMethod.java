public class OneMethod {
    static int a = 10;//[1]
    static int b = 20;//[2]

    public static void main (String[] args) {
        printThreeValues();//[3]
    }
    private static void printThreeValues() {//[20]
        int maximum = a;//[21]
        if (b > a) {//[22]
            maximum = b;//[23]
        }
        int minimum = a;//[24]
        if (b < a) {//[25]
            minimum = b;//[26]
        }
        int average = (a + b) / 2;//[27]
        System.out.println("[28] 最大値：" + maximum);
        System.out.println("[29] 最小値：" + minimum);
        System.out.println("[30] 平均値：" + average);
    }
}
