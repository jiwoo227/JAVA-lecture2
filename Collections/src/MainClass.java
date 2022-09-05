import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("JAVA");
        list.add("C++");
        list.add("JAVASCRIPT");

        list.add(2,"hello"); //추가
        list.set(1, "C"); // 변경

        list.get(2); //데이터 출력

        list.remove(2); //데이터 삭제

        list.clear(); //데이터 전체 삭제
    }
}
