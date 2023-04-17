public class SumFromOneToTen {
    public static void main (String[] args){
        int sum = 0;//[1]
        for (int number = 1; number <= 10; number++) {//[2]
            sum += number;//[3]
        }
        System.out.println("sum:" + sum);//[4]
    }
}
