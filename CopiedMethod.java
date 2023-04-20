public class CopiedMethod {
    static int a = 10;//[1]
    static int b = 20;//[2]

    public static void main(String[] args) {
        printOneValue();//[3]
        printThreeValues();//[4]
    }
    private static void printOneValue() {//[5]
        int maximum = a;//[6]
        if (b > a) {//[7]
            maximum = b;//[8]
        }
        System.out.println("[10] 最大値;" + maximum);//[10]
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
        int average = (a + b) / 2;
        System.out.println("[27] 最大値：" + maximum);
        System.out.println("[28] 最小値：" + minimum);
        System.out.println("[29] 平均値：" + average);
    }
}
