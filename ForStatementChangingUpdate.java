public class ForStatementChangingUpdate {
    public static void main (String[] args){
        System.out.println("[1] 更新:number += 1");
        for(int number = 1;number <=8;number += 1){//[2]
            System.out.print("[2]-" + number + " ");
        }
        System.out.println("");//[3]
        System.out.println("[4] 更新:number += 2");
        for(int number = 1;number <= 8;number += 2){//[5]
            System.out.print("[5]-" + number + " ");
        }
        System.out.println("");//[6]
        System.out.println("[7] 更新:number += 3");
            for(int number = 1;number <= 8;number += 3){//[8]
            System.out.print("[9]-" + number + " ");
        }
        System.out.println("");//[10]
    }
}
