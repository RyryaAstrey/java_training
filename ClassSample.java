public class ClassSample {
    
    //フィールド
    String name;    //[1]
    String address; //[2]

    //実行メソッド[3]
    public void exec(){
        init();         //[4]
        name = "RecurrentTechnology";   //[6]
        address = "東京";   //[7]
        printMessage(); //[8]

    }
    //初期化メソッド[5]
    public void init(){
        name ="";   //[4]
        address = "";   //[5]
    }

    //メッセージ出力メソッド[9]
    public void printMessage(){
        System.out.println(getMessage());   //[10]
    }
    //メッセージ設定メソッド[11]
    private String getMessage(){
        return "私は" + name + "です。" + address + "に住んでいます。"; //[12]
    }
    
}
