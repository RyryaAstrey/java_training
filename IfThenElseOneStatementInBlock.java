public class IfThenElseOneStatementInBlock {
    public static void main(String[] args) {
        int number = 2;//[1]
        if (number == 1) {//[2]
            System.out.println("[3] number = 1");
        } else {//[4]
            System.out.println("[5] else - number = 1");
        }
        if (number == 2) {//[6]
            System.out.println("[7] number = 2");
        } else {//[8]
            System.out.println("[9] else - number = 2");
        }
        if (number == 3) {//[10]
            System.out.println("[11] number = 3");
        } else {//[12]
            System.out.println("[13] else - number = 3");
        }
    }
}
