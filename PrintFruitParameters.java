public class PrintFruitParameters {
    public static void main (String[] args) {
        printData(10, 1.2);//[1]
        printData(1.2, 10);//[2]
    }
    private static void printData(int quantity, double weight) {//[3]
        System.out.print("[4] 数量:" + quantity + "個");
        System.out.println("[5] 重さ:" + weight + "kg");
    }
    private static void printData(double weight, int quantity) {//[6]
        System.out.print("[7] 重さ:" + weight + "kg");
        System.out.println("[8] 数量:" + quantity + "個");
    }
}