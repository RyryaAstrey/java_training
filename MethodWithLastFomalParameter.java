public class MethodWithLastFomalParameter {
    public static void main (String[] args) {
        printWeightAverage("クラスA", 35.6, 54.7);//[1]
        printWeightAverage("クラスB", 44.2, 35.6, 60.8, 54.7);//[2]
        printWeightAverage("クラスC", 44.2, 35.6, 60.8, 54.7, 99.9, 32.4);//[3]
    }
    private static void printWeightAverage(String className, double ... weights) {//[4]
        double sum = 0;//[5]
        for(double weight: weights) {//[6]
            sum += weight;//[7]
        }
        System.out.println("[8] " + className + ": (人数:" + weights.length + ") ");
        System.out.println("[9] 体重:" + sum / weights.length);
    }
}
