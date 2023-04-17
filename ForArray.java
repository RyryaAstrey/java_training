public class ForArray {
    public static void main (String[] args){
        //基本的なfor文を使ったサンプルプログラム
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//[1]
        for (int index = 0; index < numbers.length; index ++) {//[2]
            System.out.println("[3] number = " + numbers[index]);
        }

        //配列のサンプルプログラム（拡張for文で表示）
        int numbers1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//[1]
        for (int number : numbers1) {//[2]
            System.out.println("[3] number = " + number);
        }
    }
}
