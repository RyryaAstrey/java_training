public class ReturnFromIfStatement {
    public static void main(String[] args) {
        calculatePrice(3,100);//[1]
        System.out.println("[2] 計算の終わり");
        calculatePrice(-1,200);//[3]
        System.out.println("[4] 計算の終わり");
    }
    private static void calculatePrice(int number,int price) {//[5]
        if(number < 0){//[6]
            System.out.println("[7] 個数の値：" + number + "がマイナスです。");
            return;//[8]
        }
        System.out.println("[9] 果物１つの値段：" + price/number);//[9]
    }
}
