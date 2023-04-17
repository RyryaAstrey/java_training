public class PrintEscapeSequence {
    public static void main(String[] args) {
        String SingleQuotation = "ABC \' DEF";//[1]
        String DoubleQuotation = "ABC \" DEF";//[2]
        String yen = "ABC \\ DEF";//[3]
        String linefeed = "ABC \n DEF";//[4]
        System.out.println("[5] SingleQuotation = " + SingleQuotation);
        System.out.println("[6] DoubleQuotation = " + DoubleQuotation);
        System.out.println("[7] yen = " + yen);
        System.out.println("[8] linefeed = " + linefeed);
    }
}
