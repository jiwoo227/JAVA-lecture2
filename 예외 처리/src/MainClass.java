public class MainClass {
    public static void main(String[] args){
        int i = 10;
        int j= 0;
        int r = 0;

        System.out.println("Exception BEFORE");
        try {
            r = i/j;
        }catch (Exception e){
            e.printStackTrace(); //예외를 간략하게 보여줌
            String msg = e.getMessage();
            System.out.println("Msg:" + msg);
        }

        System.out.println("Exception AFTER");
    }
}
