public class IncrementNumberInWhileOrDoWhile {
    public static void main(String[] args) {
        int number = 7;//[1]
        while (number < 5) {//[2]
            number ++;//[3]
            System.out.println("[4] while -> number = " + number);
        }
        number = 7;//[5]
        do {//[6]
            number ++;//[7]
            System.out.println("[8] do while -> number:" + number);
        } while (number < 5);//[9]
    }
}
