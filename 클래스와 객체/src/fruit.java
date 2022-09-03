public class fruit {

    public String berry;
    public String taste;
    public int price;

    public fruit(){
        System.out.println("과일이다!");
    }

    public void yummy(){
        System.out.println("너가 좋아하는 과일은?");
        System.out.println("내가 좋아하는 과일은" + berry + "이야!");
        System.out.println("맛은" + taste);
        System.out.println("가격은" + price + "이야!");
    }

}
