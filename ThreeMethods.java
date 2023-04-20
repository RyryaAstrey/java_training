public class ThreeMethods {
    static int a = 10;//[1]
    static int b = 20;//[2]

    public static void main (String[] args) {
        printMaximum();//[3]
        printMinimum();//[4]
        printAverage();//[5]
    }
    private static void printMaximum() {//[20]
        int maximum = a;//[21]
        if (b > a) {//[22]
            maximum = b;//[23]
        }
        System.out.println("[24] 最大値;" + maximum);
    }
    private static void  printMinimum() {//[25]
        int minimum = a;//[26]
        if ( b < a) {//[27]
            minimum = b;//[28]
        }
        System.out.println("[29] 最小値;" + minimum);
    }
    private static void printAverage() {//[30]
        int average = (a + b) / 2;//[31]
        System.out.println("[32] 平均値;" + average);
    }
}
