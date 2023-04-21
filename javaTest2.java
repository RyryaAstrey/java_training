public class javaTest2 {
    public static void main(String[] args) throws Exception{
        try{
            String name = null;
            name = name.substring(0);//[1]
        } catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            String values[] = new String[2];
            values[2] = "value";//[2]
        } catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            Object value = "value";
            Integer number = (Integer)value;//[3]
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
