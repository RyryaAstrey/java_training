public class PrintFruitParameter {
    public static void main (String[] args) {
        printData();//[1]
        printData(10);//[2]
        printData(1.2);//[3]
    }
    private static void printData() {//[4]
        System.out.println("[5] 名前:りんご");
    }
    private static void printData(int quantity) {//[6]
        System.out.println("[7] 数量:" + quantity + "個");
    }
    private static void printData(double weight) {//[8]
        System.out.println("[9] 重さ:" + weight + "kg");
    }
}
