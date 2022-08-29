import java.util.*;
public class for문 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int go = scan.nextInt();

        for(int i=1; i<10; i++){
            System.out.printf("%d * %d = %d\n", go, i, (go*i));
        }
    }
}
