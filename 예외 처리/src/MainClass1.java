public class MainClass1 {
    public static void main(String[] args){

        MainClass1 mainClass1 = new MainClass1();

        try {
            mainClass1.firstmethod();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void firstmethod() throws Exception{
        secondmethod();
    }

    public void secondmethod() throws  Exception{
        thirdmethod();
    }

    public void thirdmethod() throws Exception{
        System.out.println("10/0=" + (10/0));
    }
}
