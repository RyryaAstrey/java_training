public class SwitchHavingMultiLabel {
    public static void main(String[] args) {
        int number = 3;//[1]
        switch (number) {//[2]
            case 1://[3]
            case 2://[4]
                System.out.println("[5] number = 1, 2");
                break;//[6]
            case 3://[7]
            case 4://[8]
            case 5://[9]
                System.out.println("[10] number = 3, 4, 5");
                break;//[11]
        }
    }
}
