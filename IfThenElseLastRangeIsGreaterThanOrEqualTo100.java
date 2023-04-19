public class IfThenElseLastRangeIsGreaterThanOrEqualTo100 {
    public static void main(String[] args) {
        int number = 200;//[1]
        if (number >= 1 && number <= 9){//[2]
            System.out.println("[3] number : 1 - 9");
        } else if (number >= 10 && number <= 99) {//[4]
            System.out.println("[5] number : 10 - 99");
        } else {//[6]
            System.out.println("[7] number >= 100");
        }
    }
}
