public class CommonMethods {
    static int a = 10;//[1]
    static int b = 20;//[2]

    public static void main(String[] args) {
        printOneValue();//[3]
        printThreeValues();//[4]
    }
    private static void printOneValue() {//[5]
        printMaximum();//[6]
    }
    private static void printThreeValues() {//[7]
        printMaximum();//[8]
        printMinimum();//[9]
        printAverage();//[10]
    }
    private static void printMaximum() {//[20]
        int maximum = a;//[21]
        if (b > a) {//[22]
        maximum = b;//[23]
        }
        System.out.println("[24] 最大値；" + maximum);
    }
    private static void printMinimum() {//[25]
        int minimum = a;//[26]
        if (b > a) {//[27]
            minimum = b;//[28]
        }
        System.out.println("[29] 最小値；" + minimum);
    }
    private static void printAverage() {//[30]
        int average = (a + b) / 2;//[31]
        System.out.println("[32] 平均値；" + average);
    }
}
