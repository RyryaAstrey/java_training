public class DoWhileFromOneToFive {
    public static void main(String[] args) {
        int number = 1;//[1]
        do {
            number ++;//[2]
            System.out.println("[3] number = " + number);
        } while (number < 5);//[4]

        number = 4;//[5]
        do {
            number ++;//[6]
            System.out.println("[7] number = " + number);
        } while (number < 5);//[8]

        number = 5;//[9]
        do {
            number ++;//[10]
            System.out.println("[11] number = " + number);
        } while (number <5);//[12]
    }
}
