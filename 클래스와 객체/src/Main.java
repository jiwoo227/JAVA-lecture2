public class Main {
    public static void main(String[] args){
        Grandeur myCar1 = new Grandeur();
        myCar1.color = "red";
        myCar1.gear = "auto";
        myCar1.price = 1000;

        myCar1.run();
        myCar1.stop();
        myCar1.info();
    }
}
