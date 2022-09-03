public class Memories2 {
    public static void main(String[] args){
        Memories2 obj = new Memories2();
        Memories2 obj2 = new Memories2();
        Memories2 obj3 = new Memories2();

        if(obj == obj2){
            System.out.print("obj == obj2");
        }else{
            System.out.println("obj != obj2");
        }

        if(obj3 == obj2){
            System.out.print("obj2 == obj3");
        }else{
            System.out.println("obj2 != obj3");
        }

        if(obj == obj3){
            System.out.print("obj == obj3");
        }else{
            System.out.println("obj != obj3");
        }
    }
}
