public class SwitchByCharacterTypeValue {
    public static void main(String[] args) {
        char character = 'C';//[1]
        switch (character) {//[2]
            case 'A'://[3]
                System.out.println("[4] character = A");
                break;//[5]
            case 'B'://[6]
                System.out.println("[7] character = B");
                break;//[8]
            case 'C'://[9]
                System.out.println("[10] character = C");
                break;//[11]
            case 'D'://[12]
                System.out.println("[13] character = D");
                break;
            case 'E'://[15]
                System.out.println("[16] character = E");
                break;//[17]
        }
    }
}
