public class ComplexForInitialization {
    public static void main (String[] args){
        System.out.println("[1] 初期化: x = 1, y = 2, z = 3");
        for(int x = 1, y = 2, z = 3; x <= 5; x ++){//[2]
            System.out.print("[3]-" + x + "," + y + "," + z + " ");
        }
        System.out.println("");//[4]
        int a = 0, b = 0, c = 0;//[5]
        System.out.println("[6] 初期化:a = 1, b ++, c = a + 2");
        for (a = 1, b ++, c = a + 2; a < 5; a ++) {//[7]
            System.out.print("[8]-" + a + "," + b + "," + c + " ")
        }
    }
}
