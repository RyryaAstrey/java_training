import java.util.List;
import java.util.Arrays;

public class javaTest2 {
    public static void main(String[] args) throws Exception{
        List<String> params = Arrays.asList(args);
        for(String param : params){
            System.out.println(param);
        }
    }
}
