public class WhileFromOneToFive {
    public static void main(String[] args) {
        int number = 1;//[1]
        while (number < 5) {//[2]
            number ++;//[3]
            System.out.println("[4] number = " + number);
        }
        number = 4;//[5]
        while (number < 5) {//[6]
            number ++;//[7]
            System.out.println("[8] number = " + number);
        }
        number = 5;//[9]
        while (number < 5) {//[10]
            number ++;//[11]
            System.out.println("[12] number = " + number);
        }
    }
}
