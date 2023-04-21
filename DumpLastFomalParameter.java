public class DumpLastFomalParameter {
    public static void main (String[] args) {
        printNumbers(101, 102, 103, 140, 105, 106);//[1]
    }
    private static void printNumbers(int ... numbers) {//[2]
        for (int index = 0; index < numbers.length; index++) {//[3]
            System.out.println("[4] number["+ index +"]:" + numbers[index]);
        }
    }
}
