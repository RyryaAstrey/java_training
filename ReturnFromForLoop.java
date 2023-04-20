public class ReturnFromForLoop {
    public static void main(String[] args) {
        forLoop();//[1]
    }
    private static void forLoop(){//[2]
        for(int number = 1;number <= 10;number++){//[3]
            System.out.println("[4] number:" + number);
            switch(number) {//[5]
                case 1://[6]
                case 2://[7]
                    continue;//[8]
                case 3://[9]
                    return;//[10]
                default://[11]
                    break;//[12]
            }
        }
    }
}
