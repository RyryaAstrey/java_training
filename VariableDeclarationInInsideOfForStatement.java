public class VariableDeclarationInInsideOfForStatement {
    public static void main (String[] args){
        for (int number = 1, lastNumber = 0; number <= 5; number++){//[1]
        lastNumber = number;//[2]
        System.out.println("[3] lastNumber:" + lastNumber);
        }
        System.out.println("");//[4]
        //System.out.println("[5] lastNumber:" + lastNumber); //この文はエラーになる。
        for (int number =1; number <= 5; number++){//[6]
        int lastNumber = number;//[7]
        System.out.println("[8] lastNumber:" + lastNumber);
        }
        // System.out.println("[9] lastNumber:" + lastNumber); //この文はエラーになる。
        System.out.println("");

        int lastNumber = 0;//[1]
        for (int number = 1; number <= 5; number++) {//[2]
            lastNumber = number;//[3]
            System.out.println("[4] lastNumber:" + lastNumber);
        }
        System.out.println("[5] lastNumber:" + lastNumber);
    }
}
